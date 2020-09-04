import java.util.Scanner;
public class Switch
{ 

            public static void main(String args[])
           {
              System.out.println("Main starts");
              Scanner sc=new Scanner(System.in);
              System.out.println("Enter A Value");
              System.out.println("Enter Case 1,2,3");
              int i=sc.nextInt();  
     
             switch(i)
                {
                   case 1:
                   System.out.println("One");
                   break;
 
                   case 2:
                   System.out.println("Two");
                   break;
           
                   case 3:
                   System.out.println("Three");
                   break;
                 
                   default:
                   System.out.println("Others");
                 } 
           }
}