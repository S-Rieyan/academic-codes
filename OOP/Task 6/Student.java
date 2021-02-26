
public class Student implements StInterface{
     String name;
     int id;
     String address;
     public void setName(String n){
          name = n;
     }
     public void setID(int i){
          id = i;
     }
     public String getName(){
          return name;
     }
     public int getID(){
          return id;
     }
     public void setAddress(String a){
          address = a;
     }
     public String getAddress(){
          return address;
     }
}