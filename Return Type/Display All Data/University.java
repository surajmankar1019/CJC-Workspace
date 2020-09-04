public class University
{


         public static void  main(String args[])

      {  
          College c=new  College();
          
          AllForm  all= c.getAllData();
     
          System.out.println(all.sf1.getRollno());
          System.out.println (all.sf1.getName());
          System.out.println(all.sf1.getAge());
          System.out.println(all.sf1.getAddress()); 

          System.out.println(all.sf2.getRollno());
          System.out.println (all.sf2.getName());
          System.out.println(all.sf2.getAge());
          System.out.println(all.sf2.getAddress());

          System.out.println(all.sf3.getRollno());
          System.out.println (all.sf3.getName());
          System.out.println(all.sf3.getAge());
          System.out.println(all.sf3.getAddress());
 
      } 
}

