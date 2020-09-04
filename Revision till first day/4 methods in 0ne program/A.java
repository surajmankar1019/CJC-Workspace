public class A
{
     
       public void m1()
      {
        System.out.println("Main---M1");
      } 
      public static void main(String args[])
      {
        System.out.println("Main Method Starts");
         A a=new A();
            a.m1();
         B b=new B();
            b.m2();
         C c=new C();
            c.m3();
         D d=new D();
             d.m4();
        System.out.println("Main Method Ends");
         }
}