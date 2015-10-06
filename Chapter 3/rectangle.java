
import java.util.Scanner;
import java.lang.Math;

public class rectangle
{
    public static void main(String[] args){
        
        Scanner inpt = new Scanner(System.in);
        System.out.print("Rectangles Width: ");
        double width = inpt.nextDouble();
        System.out.print("Rectangles Height: ");
        double height = inpt.nextDouble();
        double perimeter =  width*2+height*2;
        System.out.println("The Perimeter of the Rectangle is, "+ perimeter);
        System.out.println("The length of diagonal is, "+Math.sqrt(width*width+height*height));
        
        
    }
}
        