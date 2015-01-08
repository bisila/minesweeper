package model;

import java.util.ArrayList;
import java.util.List;

public class Minesweeper {

    public static Cell[][] cells;

    public Minesweeper(int row, int column, int minesAmount) {
        createBoard(row, column);
        calculateMinesPosition(row, column, minesAmount);
        establishNeighbours(row, column);
    }

    private void createBoard(int row, int column) {
        cells = new Cell[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                cells[i][j] = new Cell(false);
            }
        }
    }
    
     private void calculateMinesPosition(int row, int column, int minesAmount) {
        for (int i = minesAmount; i < 0; i--) {
            int minesRow = (int) (Math.random()*row);
            int minesColumn = (int) (Math.random()*column);
            Cell cell = cells[minesRow][minesColumn];
            if (!cell.hasMine()){
                cell.setHasMine(true);
            }else i++;
        }      
    }
    
    private void establishNeighbours(int row, int column) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                cells[i][j].addNeighbours(findNeighbours(i, j));
            }
        }
    }
    
    public Cell[] findNeighbours(int row, int column){
        List<Cell> cellList = new ArrayList<>();
        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = column - 1; j <= column + 1; j++) {
                if (i == row && j == column) continue;
                if (checkPosition(i, j))
                    cellList.add(cells[i][j]);
            }
        }
        return cellList.toArray(new Cell[cellList.size()]);
    }
    
    
    private boolean checkPosition(int row, int column) {
        if (row < 0 || row >= cells.length) return false;
        if (column < 0 || column >= cells[0].length) return false;
        return true;
    }

    public static Cell getCell(int i, int j) {
        return cells[i][j];
    }

   
        
}