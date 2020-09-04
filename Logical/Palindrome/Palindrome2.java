public class Palindrome2
{
     public static void main(String args[])
      {
            int n=453,r=0,no;
             no=n;
            while(n>0)
           {
             int t=n%10;
              r=(r*10)+t;
              n=n/10;
           }
           if(r==no)
            {
               System.out.println("Palindrom");
            }
           else
          {
              System.out.println("Not sPalindrom");
          }
      }
}