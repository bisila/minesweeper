package model;

import static model.Cell.Mark.NoMark;
import static model.Cell.Status.Closed;
import static model.Cell.Status.Opened;

public class Cell{

    public enum Status { Opened, Closed }
    public enum Mark { NoMark, Question, Flag }
    
    private boolean hasMine;
    private Cell[] neighbours;
    private Status status;
    private Mark mark;

    public Cell(boolean hasMine) {
        this.hasMine = hasMine;
        this.status = Closed;
        this.mark = NoMark;
    }

    public void open(){
        this.status = Opened;
    }

    public Status getStatus() {
        return status;
    }

    public Mark getMark() {
        return mark;
    }
    
    public boolean hasMine() {
        return hasMine;
    }
    
    protected void addNeighbours(Cell[] neighbours) {
        this.neighbours = neighbours;
    }

    public Cell[] getNeighbours() {
        return this.neighbours;
    }
    
    public int getMinesAround(){
        int amount = 0;
        for (Cell neighbour : neighbours)
            amount += neighbour.hasMine() ? 1 : 0;
        return amount;
    }

    public void setHasMine(boolean hasMine) {
        this.hasMine = hasMine;
    }
    
    
}