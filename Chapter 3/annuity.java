import java.lang.Math;
import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Write a description of class annuity here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class annuity
{
    public static void main(String[] args){
        
        Scanner inpt = new Scanner(System.in);
        System.out.print("Interest rate: ");
        double i = inpt.nextDouble();
        System.out.print("Number of payments: ");
        double n = inpt.nextInt();
        System.out.print("Amount put in: ");
        double PMT = round(inpt.nextDouble(), 2);
   
        double PVann = round(PMT * ((Math.pow(1+i, n-1)-1)/i)/(Math.pow(1+i, n-1))+1, 2);
        System.out.println("Final amount: " + PVann);
    }
    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();
    
        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}