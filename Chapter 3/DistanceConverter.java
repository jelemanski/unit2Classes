public class DistanceConverter
{
   public static final int feetInAYard = 3;
   public static void main(String[] args)
   {
      static final double yards = 3.5;
      double feet = yards * feetInAYard;
      double inches = feet * 12;
      
      System.out.println(yards + "yards are" + feet + "feet");
      System.out.println(yards + "yards are" + inches + "inches");
   }
}