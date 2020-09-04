
public class Prime
{

        public static void main(String args[])
        {

         int n=7;
          int flag=0;
          for(int i=2;i<=n-1;i++)
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