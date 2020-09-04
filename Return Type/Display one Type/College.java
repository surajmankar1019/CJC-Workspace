public class College 
{

        public StudentForm getAllData()
     
      {
           StudentForm s1=new StudentForm();
           
           s1.setRollno(1);
           s1.setName("Suraj Mankar");        
           s1.setAge(24);
           s1.setAddress("Nagpur");

           StudentForm s2=new StudentForm();
           s2.setRollno(2);
           s2.setName("Sushil Mankar");        
           s2.setAge(24);
           s2.setAddress("Amaravati");
           
           return s2;
      }   
}