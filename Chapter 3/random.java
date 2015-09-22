import java.awt.Color;

/**
 * Write a description of class random here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
class random

{
    public static void main( String[] args )
    {
        //World world = new World();
        random r = new Random();
        Turtle t = new Turtle(world);
        int sides = r.nextInt(9)+3;
        for(int x=0; x<sides; x++){
            t.forward(50);
            t.turn(180*(sides-2));
        }
    }
}