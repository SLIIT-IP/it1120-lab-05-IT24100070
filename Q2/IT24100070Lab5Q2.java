import java.util.Scanner;
public class IT24100070Lab5Q2{
   public static void main(String[] args)
   {
     Scanner input = new Scanner(System.in);
     int num;
     System.out.println("Enter the number of new members introduced: ");
     num = input.nextInt();

     if(num<0)
     {
       System.out.print("Input must be a number 0 or greater");
     }
     else
     { 
      String prize;

        switch(num)
        {
         case 0 : System.out.print("No Prize");
                   break; 
         case 1 : System.out.print("Pen");
                   break;
         case 2 : System.out.print("Umbrella");
                   break; 
         case 3 : System.out.print("Bag");
                   break; 
         case 4 : System.out.print("Travelling Chair");
                   break;
         default : System.out.print("Headphone");
                  break;
        }
  
        }
    }
}                 