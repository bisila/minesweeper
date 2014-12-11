package control;

import ui.CellDialog;
import ui.CellDisplay;

public class OpenOperation {

    private final CellDialog dialog;
    private final CellDisplay display;

    public OpenOperation(CellDialog dialog, CellDisplay display) {
        this.dialog = dialog;
        this.display = display;
    }
    
    public void execute(){
        dialog.getCell().open();
        if(dialog.getCell().hasMine())
            new OpenBoardOperation();
    }
    
}
