import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;


/**
 * Write a description of class street here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Street

{
     private int xLeft;
 private int yTop;
    public Street(int x, int y)
    {
        xLeft = x;
        yTop = y;
        
        
    }

    public void draw(Graphics2D g2)
    {
        Rectangle street = new Rectangle(0,200,800,400);
        
        
        g2.setColor(Color.darkGray);
        g2.fill(street);
        
        g2.draw(street);
    
    
}
}

