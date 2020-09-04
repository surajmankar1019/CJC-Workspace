import java.util.*;

public class Rank
{
      
            public static void main(String args[])
            { 
              System.out.println("Main Starts");
              Scanner sc=new Scanner(System.in);
              System.out.println("Enter Percentage");
              int a=sc.nextInt();
                          
                  if(a>=75)
                   {
                      System.out.println("a is Distinction");
                      
                   }
                  else if(a>60&&a<75)
                   {
                     System.out.println("Result is First Division");
                   }
                  else if(a>45&&a<60)
                   {
                     System.out.println("Result is Second Division");
                   }
                 else if(a<35)
                   {
                     System.out.println("Result is Failed");
                   }
                
                else
                  {
                         System.out.println("Enter Valid Input");
                  }
           }
}