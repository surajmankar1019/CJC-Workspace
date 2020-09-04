public class College
{
 
        public AllForm getAllData()

       {
          AllForm all=new  AllForm();

          all.sf1.setRollno(1);
          all.sf1.setName("Suraj Mankar");
          all.sf1.setAge(25);
          all.sf1.setAddress("Nagpur");

           
          all.sf2.setRollno(2);
          all.sf2.setName("Shailesh Mankar");
          all.sf2.setAge(22);
          all.sf2.setAddress("Ngp");

          all.sf3.setRollno(3);
          all.sf3.setName("Achal khade");
          all.sf3.setAge(22);
          all.sf3.setAddress("Hydrabad");

             return all;
       }




}