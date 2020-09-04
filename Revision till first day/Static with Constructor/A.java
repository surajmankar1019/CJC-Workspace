public class A
{
       
          public A()
         {
            System.out.println("Constructor--A");
         }
        static 
         {
            System.out.println("Static--- Block");
         }
           public static void main(String args[])
         {
             System.out.println("Main---Starts");
              
                A a=new A();
                  A a1=new A();
         }
}