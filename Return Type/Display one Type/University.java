public class University
{

            public static void main(String args[])
         {
             College c=new  College();
             StudentForm stu=c.getAllData();
             System.out.println("Rollno="+stu.getRollno());
             System.out.println("Name="+stu.getName());
             System.out.println("Age="+stu.getAge());
             System.out.println("Address="+stu.getAddress());         
          }

}