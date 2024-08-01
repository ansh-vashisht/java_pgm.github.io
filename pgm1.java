package lab1;
import java.util.*;

class pgm1 {
   public static void main(String args[]) {
       Scanner obj = new Scanner(System.in);
       System.out.println("Enter 2 numbers: ");
       int a = obj.nextInt();
       int b = obj.nextInt();
       if (a == b)
           System.out.println("Both numbers are equal");
       else if (a > b)
           System.out.println(a + " is larger");
       else
           System.out.println(b + " is larger");
   }
}

