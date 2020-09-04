import java.util.Scanner;

public class WhileScanner
{

          public static void main(String args[])
         {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a value");
            int i=sc.nextInt();
        
            while(i<=10)
            {
              System.out.println(i);
              i ++;
            }
         }
}