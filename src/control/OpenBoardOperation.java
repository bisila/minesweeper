package control;

import model.Minesweeper;

public class OpenBoardOperation {
  
    public OpenBoardOperation() {
    }
    
    public void openBoard(){
        for (int i = 0; i < Minesweeper.cells.length ; i++) {
            for (int j = 0; j < Minesweeper.cells[0].length ; j++) {
                if (Minesweeper.getCell(i, j).hasMine())
                    Minesweeper.getCell(i, j).open();
            }
        }
    }
}
