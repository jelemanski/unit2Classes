import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;




/**
 * Write a description of class Building here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Building
{
 private int xLeft;
 private int yTop;
 
 public Building(int x, int y)
 {
     xLeft = x;
     yTop = y;
     /**
      * 
      *Constructs a building with a given top left corner.
      *@param x the x-coordinate of the top-left corner
      *@param y the y-coordinate of the top-left corner
      */
    }
    
    public void draw(Graphics2D g2)
    {
        Rectangle frame = new Rectangle(100,100,200,200);
        //Rectangle door = new Rectangle(180,100,125,200);
        
        g2.setColor(Color.RED);
        g2.fill(frame);
        //g2.setColor(Color.black);
        //g2.fill(door);
        
        
        g2.draw(frame);
        //g2.draw(door);
    }
}
 
