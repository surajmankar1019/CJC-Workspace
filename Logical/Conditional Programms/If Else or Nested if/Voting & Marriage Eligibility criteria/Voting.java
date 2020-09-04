// check given candidates is elligible for voting or not.


import java.util.*;
public class Voting
{

        public static void main(String args[])
       {
           System.out.println("Main Starts");
 
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter Value");
           int x=sc.nextInt();
           if (x>=18)
              {
                 System.out.println("You Are Welcome,Plz Be a Part Of  Election 2019");
                 System.out.println("Plz Vote for Nation in Election 2019");

                         if(x>=21)
                       {
                           System.out.println("You are Elligible for Marriage,All the best");
                       }
                        else
                      {
                            System.out.println("You Are Not elligible for Marriage");
                      }
              }
           else
              {
                  System.out.println("You Are Not elligible for Election 2019");
                  System.out.println("You Are Not elligible for Marriage");
              }
                        
        }
          
 }




