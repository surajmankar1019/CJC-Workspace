import java.util.*;

public class Swap
{
     
              public static void main(String args[])
            { 
                 
  
                  System.out.println("Main Starts");
                  Scanner sc=new Scanner(System.in);
                  System.out.println("Enter First Value");
                  int a=sc.nextInt();
                  System.out.println("Enter Second Value");
                  int b=sc.nextInt();
 
                  System.out.println("Before Swapping a="+a);
                  System.out.println("Before Swapping a="+b);

                  int temp=0;
                    temp=a ;
                    a=b;
                    b=temp;

                  System.out.println("After Swapping a="+a);
                  System.out.println("After Swapping temp="+b);
           }
}