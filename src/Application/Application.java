package Application;

import model.Minesweeper;
import ui.MinesweeperDialog;

public class Application {
    
    private MinesweeperDialog minesweeperDialog;
    private int row = minesweeperDialog.getRow();
    private int column = minesweeperDialog.getColumn();
    private int minesAmount = minesweeperDialog.getMinesAmount();
    private Minesweeper minesweeper = new Minesweeper(row, column, minesAmount);    
    
    
    
    
    
}
