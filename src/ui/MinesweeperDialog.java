package ui;

import java.util.Scanner;

public class MinesweeperDialog {

    Scanner scanner = new Scanner(System.in);
    
    public void MinesweeperDialog(){        
    }

    public int getRow() {
        System.out.println("¿Numero de filas?");  
        return scanner.nextInt();
    }
    
    public int getColumn() {
        System.out.println("¿Numero de columnas?");  
        return scanner.nextInt();
    }
    
    public int getMinesAmount() {
        System.out.println("¿Numero de minas?");  
        return scanner.nextInt();
    }
}
