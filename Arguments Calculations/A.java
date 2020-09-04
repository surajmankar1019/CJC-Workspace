public class A
{
    
    public void sum(int x, int y)
    {
       int c=x+y;
       System.out.println("Sum="+c);
    }
     public static void main(String args[])
    {
        System.out.println("Hello");

        A a=new A();
          a.sum(10,20);
          
    }
}