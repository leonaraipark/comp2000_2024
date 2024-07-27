import java.awt.*;

import javax.print.attribute.standard.Sides;

public class Cell {
    static int SIZE = 35;
    int x;
    int y;
    
    // class constructor
    Cell(int x, int y){
        this.x = x;
        this.y = y;
    }

    void paint(Graphics g){
        g.setColor(Color.BLACK);
        g.fillRect(x, y , SIZE, SIZE);
        g.setColor(Color.WHITE);
        g.drawRect(x, y , SIZE, SIZE);

    }
}


//static int SIZE;
    //static int xCoord;
    //static int yCoord;

    //public Cell(int SIZE, int ){
        
    //}
    //g.setColor(Color.BLACK);
    //g.drawRect(xCoord, yCoord , SIZE, SIZE);
    //g.setColor(Color.WHITE);
    //g.fillRect(xCoord, yCoord , SIZE, SIZE);

