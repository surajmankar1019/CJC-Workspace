public class Pattern6
{
      public static void main(String args[])
      {
        int c=1;
        for(int i=1;i<=5;i++)
        {
          for(int j=1;j<=5-i;j++)
           {
             System.out.print(" ");
           }
             for(int j=1;j<=c;j++)
            {
               System.out.print("*") ;
            }
                 c=c+2;
                 System.out.println();
          }
        }

}