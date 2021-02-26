public class TestStudent{
     public static void printName(Student s){
          
          System.out.println(s);
     }
     public static void main(String [] args){
          printName(new BBAStudent ());
          printName(new BBAStudent ("Barack Obama"));
          printName(new BBAStudent("John McCain"));
          
     }
}