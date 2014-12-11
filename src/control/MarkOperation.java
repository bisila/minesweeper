package control;

import ui.CellDialog;
import ui.CellDisplay;

public class MarkOperation {
    
    private final CellDialog dialog;
    private final CellDisplay display;

    public MarkOperation(CellDialog dialog, CellDisplay display) {
        this.dialog = dialog;
        this.display = display;
    }
    
    public void execute(){
        //UPDATE CELL
        display.show();
    }
    
    
}
