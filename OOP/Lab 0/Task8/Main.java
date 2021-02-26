public class Main{
    public static void main (String args[]){
        Student john = new Student();
        Student mike = new Student();
        Student carol = new Student();
        john.setName("John");
        mike.setName("Mike");
        carol.setName("Carol");
        john.setID("1");
        mike.setID("2");
        carol.setID("3");
        john.setAddress("Mohakhali");
        mike.setAddress("Mirpur");
        carol.setAddress("Gulshan");
        john.setCGPA(3.7);
        mike.setCGPA(3.4);
        carol.setCGPA(3.65);
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