import java.util.Scanner;
public class IT24100070Lab5Q3{

   private static final int ROOM_CHARGE_PER_DAY = 48000;
   public static final int DISCOUNT_3_4_DAYS = 10;
   public static final int DISCOUNT_5_OR_MORE_DAYS = 20;

   public static void main(String[] args)
   {
   Scanner input = new Scanner(System.in);

   System.out.println("Enter Start Date(1-31):");
   int startDate = input.nextInt();
   System.out.println("Enter End Date(1-31):");
   int endDate = input.nextInt();
   
   if(startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31)
   {
    System.out.print("Error:Start Days must be between 1 and 31");
    return;
   }
   if(startDate >= endDate)
   {
    System.out.print("Error:Start Date must be less than End Date");
    return;  
   }

   int daysReserved  = endDate - startDate;

   int discountRate = 0;
       if (daysReserved >= 3 && daysReserved <= 4) {
           discountRate = DISCOUNT_3_4_DAYS;
       } else if (daysReserved >= 5) {
           discountRate = DISCOUNT_5_OR_MORE_DAYS;
       }
       float totalAmount = daysReserved * ROOM_CHARGE_PER_DAY;
       float discountAmount = totalAmount * discountRate / 100;
       float amountToBePaid = totalAmount - discountAmount;

       System.out.println("Room Charge Per Day: Rs." + ROOM_CHARGE_PER_DAY +"/=");
       System.out.println("Number of Days Reserved: " + daysReserved);
       System.out.println("Total amount to be paid: " + amountToBePaid);
     
  }
}


   

   
   