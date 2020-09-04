import java.util.*;

public class A
{
     
       public void sum(int a, int b)
     {
       int  c=a+b;
       System.out.println("Sum="+c);
      }
        
       public static void main(String args[])
     {
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter First value");
         int x=sc.nextInt();
         System.out.println("Enter Second value");
          int y=sc.nextInt();
        A a=new A();
         a.sum(x,y);
    }

}