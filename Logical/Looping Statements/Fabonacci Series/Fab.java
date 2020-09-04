import java.util.Scanner;
public class Fab
{
         public static void main(String args[])
        {
          Scanner sc=new Scanner(System.in);
           System.out.println("Enter First Value");
           int x=sc.nextInt();
           System.out.println("Enter Second Value");
           int y=sc.nextInt();
          
          int z;
         for(int i=1;i<=10;i++)
          {
              
              z=x+y;
              x=y;
              y=z;
		
         System.out.println(z);
              

          }
        }
}