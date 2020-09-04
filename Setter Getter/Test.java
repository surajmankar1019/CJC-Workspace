public class Test

{
       public static void main(String args[])
      {
         Student  s1=new  Student();
               s1.setRollno(1);
               s1.setName("Suraj Mankar");
               s1.setAge(24);
               s1.setAddress("Nagpur");

         Student  s2=new Student(); 
               s2.setRollno(2);
               s2.setName("Avi Mankar");
               s2.setAge(22);
               s2.setAddress("Hydrabad");
       
         System.out.println("Rollno="+s1.getRollno());
         System.out.println("Name="+s1.getName());
         System.out.println("Age="+s1.getAge());
         System.out.println("Address="+s1.getAddress());

         System.out.println("Rollno="+s2.getRollno());
         System.out.println("Name="+s2.getName());
         System.out.println("Age="+s2.getAge());
         System.out.println("Address="+s2.getAddress());
      }
}