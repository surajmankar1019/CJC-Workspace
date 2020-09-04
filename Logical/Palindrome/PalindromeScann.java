import java.util.Scanner;
public class PalindromeScann
{
       public static void main(String args[])
       {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter A Value");
          int n=sc.nextInt(); 
          int r=0,no;
           no=n;
          while(n>0)
           {
               int t=n%10;
               r=(r*10)+t;
               n=n/10;
           }
           if(r==no)
              { 
                  System.out.println("Palindrome");
              }
            else
              {
                 System.out.println("Not Palindrome");
              }
       }
}