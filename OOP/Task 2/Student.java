public abstract class Student{
     private String name = "Just a Student";
     protected String department="nothing";
     public abstract void setDepartment();
     protected final String getName(){
          return name;
     }
     protected final void setName(String name){
          this.name=name;
     }
     public String toString(){
          return "Name: "+name+" Department: "+department;
     }
} 

