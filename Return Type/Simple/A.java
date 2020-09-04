public class A 
{
    int x=10;
   String  name="Suraj";
   float rating=3.2f;
   double salary=30000.000d;
   long mob=9403390030l;
   boolean status=true;

        public int m1()
      {
         return x;
      }
      
        public String m2()
      {
         return name;
      }
   
       public float m3()
     {
       return rating;
     }

       public double m4()
     {
       return salary;
     }
  
       public long m5()
     {
        return mob;
     }        

       public boolean m6()
     {
       return status;
     }
       public void m7()
     {
        System.out.println("No Return Type");
     }

        public static void main(String  args[])
       {
          A a=new A();
       
       int  x= a.m1();
       System.out.println(x);
       
        String y=a.m2();
       System.out.println(y);

       float z=a.m3();
       System.out.println(z);

        double p=a.m4();
        System.out.println(p);

       long q=a.m5();
        System.out.println(q); 
       
       boolean r=a.m6();
        System.out.println(r);
     
          a.m7();
       }   
 
}