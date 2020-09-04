import java.util.Scanner;
public class Reverse
{
      public static void main(String args[])
       {
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter A Number");
           int n=sc.nextInt();
          System.out.println("Reverse=");
          while(n>0)
            {
               System.out.println(n%10);
               n=(n/10);
            }
       }
}