package minesweeper;

import model.Minesweeper;
import model.Cell;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MinesweeperTest {
    
    @Test
    public void testNeighboursCalculusForCornerCell(){
        Minesweeper minesweeper = new Minesweeper(5, 5, 5);
        Cell cell = minesweeper.getCell(0, 0);
        Cell[] neighbours = cell.getNeighbours();
        assertEquals(3, neighbours.length);
    }
    
    @Test
    public void testNeighboursCalculusForCentralCell(){
        Minesweeper minesweeper = new Minesweeper(5, 5, 5);
        Cell cell = minesweeper.getCell(1, 1);
        Cell[] neighbours = cell.getNeighbours();
        assertEquals(8, neighbours.length);
    }
    
}
