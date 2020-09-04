public class College
{ 
        public StudentsForm getAllData()
       {
         StudentsForm sf1=new StudentsForm();
                   sf1.setRollno(1);
                   sf1.setName("Suraj Mankar");
                   sf1.setAge(28);
                   sf1.setMob(8999542009l);
                   sf1.setAddr("Nagpur");
        StudentsForm sf2=new StudentsForm();
                   sf2.setRollno(2);
                   sf2.setName("Sachin Tendulkar");
                   sf2.setAge(43);
                   sf2.setMob(9403390030l);
                   sf2.setAddr("Mumbai");
        StudentsForm sf3=new StudentsForm();
                   sf3.setRollno(3);
                   sf3.setName("Rahul Gandhi");
                   sf3.setAge(47);
                   sf3.setMob(9403390029l);
                   sf3.setAddr("Delhi");
               

                   return sf1;
       }
}