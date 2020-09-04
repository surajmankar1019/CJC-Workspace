// check given number is Even or Odd.

import java.util.*;
public class UsingScanner
{
  
         public static void main(String args[])
      { 
         System.out.println("Main starts");
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter Value");
         int x=sc.nextInt();
         int i=x;
        if (x%2==0)
        {
            System.out.println("Even Number");
        }
       else
        {
           System.out.println("Odd number");
        }
         System.out.println("Main Ends");
      }  
}