public class Main{
    public static void main (String args[]){
        Student john = new Student("John","Mohakhali","1232311", 3.0);
        Student mike = new Student("Mike","Mirpur","1232432", 4.0);
        Student carol = new Student("Carol","Gulshan","1232324", 3.8);
      
        System.out.println(john.getName());
        System.out.println(john.getID());
        System.out.println(john.getAddress());
        System.out.println(john.getCGPA());
        System.out.println(mike.getName());
        System.out.println(mike.getID());
        System.out.println(mike.getAddress());
        System.out.println(mike.getCGPA());
        System.out.println(carol.getName());
        System.out.println(carol.getID());
        System.out.println(carol.getAddress());
        System.out.println(carol.getCGPA());
    }
}