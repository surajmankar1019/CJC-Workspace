public class Prime2
{
        public static void main(String args[])
        {
          int n=10,count=0;
           
           for(int i=1;i<=n;i++)
          {
            if(n%i==0)
            {
               count++;
            }
         }
           if (count==2)
            {
               System.out.println("No is Prime");
            }
         
           else
             {
                  System.out.println("No is Not Prime");
             }
            
        }
}