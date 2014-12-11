package swing;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import listeners.Listener;
import model.Cell;
import ui.CellDialog;
import ui.CellDisplay;

public class CellWidget extends JPanel implements CellDisplay, CellDialog {

    private final Cell cell;
    private JButton button;
    private Listener rightClick;
    private Listener leftClick;

    public CellWidget(Cell cell) {
        super();
        this.cell = cell;
        add(createButton());
    }
    
    @Override
    public void show() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cell getCell() {
        return cell;
    }

    private JButton createButton() {
        button = new JButton();
        button.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if (SwingUtilities.isLeftMouseButton(e))
                    leftClick.notify(CellWidget.this);
                else if(SwingUtilities.isRightMouseButton(e))
                    rightClick.notify(CellWidget.this);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });
        return button;
    }
    
}
