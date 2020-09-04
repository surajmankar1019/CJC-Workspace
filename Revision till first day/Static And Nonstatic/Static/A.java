public class A
{
        public void m1()
        {
            System.out.println("M1 Starts");
        }
       static
        {
           System.out.println("Static Block");
        }
     public static void main(String args[])
         {
            System.out.println("Main Method Starts");
                A a=new A();
               a.m1();
         }
}