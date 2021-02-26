public class Student{
    String name;
    String id;
    String address;
    double cgpa;
      public Student(String n, String a, String i, double c){
        name = n;
        id = i;
        address = a;
        cgpa = c;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public String getID(){
        return id;
    }
    public void setID(String i){
        id = i;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String a){
        address = a;
    }
    public double getCGPA(){
        return cgpa;
    }
    public void setCGPA(double c){
        cgpa = c;
    }
        
}