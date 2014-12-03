package minesweeper;

public class Minesweeper {

    public static void main(String[] args) {

    }

    private final int row = 5;
    private final int column = 5;

    public Minesweeper() {
        Cell cells [][]= new Cell[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                cells[i][j] = new Cell();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                for (int[] neighborhood : getNeighborhood(i, j)) {
                    cells[i][j].addNeighbour(cells[i+neighborhood[0]][j+neighborhood[1]]);
                }
            }
        }
    }
        
    private int[][] getNeighborhood(int i, int j) {
        if (i == 0) {
            if (j == 0) return new int[][] {{0,+1},{+1,+1},{+1,0}};
            if (j == column - 1) return new int[][] {{+1,0},{+1,-1},{0,-1}};
            return new int[][]{{0,+1},{+1,+1},{+1,0},{-1,-1},{0,-1}};
        }   
        if (i == row - 1) {
            if (j == 0) return new int[][] {{-1,0},{-1,+1},{0,+1}};
            if (j == column - 1) return new int[][] {{0,-1},{-1,-1},{-1,0}};
            return new int[][]{{0,-1},{-1,-1},{-1,0},{-1,+1},{0,+1}};
        }
        if (j == 0) return new int[][] {{-1,0},{-1,+1},{0,+1},{+1,+1},{+1,0}};
        if (j == column - 1) return new int [][] {{+1,0},{+1,-1},{0,-1},{-1,-1},{-1,0}};
        return new int[][]{{-1,-1},{-1,0},{-1,+1},{0,+1},{+1,+1},{+1,0},{+1,-1},{0,-1}};
    }
}