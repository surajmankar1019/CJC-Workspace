public class Eligible
{

                public static void main(String args[])
            {
                 System.out.println("Main Starts");
  
                 Scanner sc=new Scanner(System.in);
                 System.out.println("Enter Age");
                 int x=nextInt();
                 
                 if(x>=18&&gender=="Male"&&Nationality=="Indian")
                  {
                     System.out.println("He is eligible for Voting");
                  }
                else if(x>=18&&gender=="Female"&&Nationality=="Indian")
                 {
                     System.out.println("She is eligible for Voting");
                 }
                else
                 {
                   System.out.println("Minor");
                 }
           }   

}