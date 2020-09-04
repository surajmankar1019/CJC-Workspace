import java.util.Scanner;
public class PrimeNo
{

        public static void main(String args[])
        {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter Value of n");
           int n=sc.nextInt();
          System.out.println("Enter  A Value of i");
          int i=sc.nextInt();
         


          int flag=0;
          for(i=i;i<=n-1;i++)
             {
               if(n%i==0)
                flag=1;
                break;
             }
             if(flag==1)
             {
               System.out.println("Above Number is Not Prime Numer");
            }
          else
           {
               System.out.println("Above Number is Prime Numer");
           }
        }
}