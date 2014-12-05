package minesweeper;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JPanel;

public class Cell extends JPanel{

    private boolean mine;
    private int mineArroundCell = 0;
    private Status status;
    private Image image;//falta enlazar a imagen del cuadrado
    
    void addNeighbour(Cell cell) {
        //Añadir vecinos
        if(cell.isMine())
        mineArroundCell++;
    }

    private boolean isMine() {
        return mine;
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g); 
        g.drawImage(image, 0, 0, getWidth(), getHeight(), null);
    }
}