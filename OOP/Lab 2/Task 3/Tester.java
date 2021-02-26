import java.util.Scanner;
class Tester{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter radius of Circle: ");
    ChildSub c1 = new ChildSub(sc.nextDouble());
    System.out.println("Creating a Circle … done!");
    
    c1.setName("Circle");
    System.out.println("The area of the Circle is "+c1.space());
    System.out.println();
    
    System.out.print("Enter radius of Sphere: ");
    ChildSub c2 = new ChildSub(sc.nextDouble());
    System.out.println("Creating a Sphere … done!");
    
    c2.setName("Sphere");
    System.out.println("The volume of the Sphere is "+c2.space());
    System.out.println();
  }
}