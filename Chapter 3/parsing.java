import java.util.Scanner;

public class parsing
{
    public static void main(String[] args){
        Scanner inpt = new Scanner(System.in);
        System.out.print("please enter a number between 1,000 and 999,999: ");
        String number = inpt.next();
        int length = number.length();
        System.out.println(length);
        int n = length-4;
        String sub = number.substring(0,n);
        String sub2 = number.substring(n+1,length);
        System.out.println(sub+sub2);
        

        
        
    
        
    }
}
        

