public class StudentsForm
{
         private int rollno;
         private String name;
         private int age;
         private long mob;
         private String addr;

         public void setRollno(int rollno)
       {
          this.rollno=rollno;
       }
         public int getRollno()
      {
        return rollno;
      }
        public void setName(String name)
     {
       this.name=name;
     }
       public String getName()
    {
       return name;
    }
       public void setAge(int age)
     {
       this.age=age;
     }
      public int getAge()
     {
       return age;
     } 
      public void setMob(long mob)
     {
       this.mob=mob;
     }
      public long getMob()
     {
       return mob;
     }
      public void setAddr(String addr)
     {
       this.addr=addr;
     }
      public String getAddr()
     {
       return addr;
     }
}