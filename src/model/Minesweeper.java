package model;

import java.util.ArrayList;
import java.util.List;

public class Minesweeper {

    private Cell[][] cells;

    public Minesweeper(int row, int column, int minesAmount) {
        // TODO calculateMinesPosition
        createBoard(row, column);
        establishNeighbours(row, column);
    }

    private void establishNeighbours(int row, int column) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                cells[i][j].addNeighbours(findNeighbours(i, j));
            }
        }
    }

    private void createBoard(int row, int column) {
        cells = new Cell[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                cells[i][j] = new Cell(false);
            }
        }
    }
    
    public Cell[] findNeighbours(int i, int j){
        List<Cell> cellList = new ArrayList<>();
        for (int k = i - 1; k <= i + 1; k++) {
            for (int l = j - 1; l <= j + 1; l++) {
                if (k == i && l == j) continue;
                if (checkPosition(k, l))
                    cellList.add(cells[k][l]);
            }
        }
        return cellList.toArray(new Cell[cellList.size()]);
    }
    
    
    private boolean checkPosition(int k, int l) {
        if (k < 0 || k >= cells.length) return false;
        if (l < 0 || l >= cells[0].length) return false;
        return true;
    }

    public Cell getCell(int i, int j) {
        return cells[i][j];
    }
        
}