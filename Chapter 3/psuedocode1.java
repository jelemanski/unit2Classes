import java.util.Scanner;

public class psuedocode1
{
    public static void main(String[] args){
        Scanner inpt = new Scanner(System.in);
        System.out.print("please enter a 10 digit phone number: ");
        String number = inpt.next();
        String firstThree = number.substring(0,3);
        String secondThree = number.substring(3,6);
        String third = number.substring(6,10);
        System.out.println("("+firstThree+") "+secondThree+"-"+third);
        
    }
}