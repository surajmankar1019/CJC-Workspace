public class Test
{


           public int  sum(int a,int b)

       {
               int  c =a+b;

                return c;
       }
   
           public static void main(String args[])

       {
           Test  t=new Test();
            int  x= t.sum(20,30);
            System.out.println(x);

       }
}