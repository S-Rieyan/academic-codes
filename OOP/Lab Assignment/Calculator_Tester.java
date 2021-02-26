import java.util.Scanner;
class Calculator_Tester{
     public static void main (String args[]){
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter radius of Circle: ");
          Calc c = new Calc(sc.nextDouble(), "Circle");
          System.out.println("Creating a Circle … done!");
          System.out.println("The area of the Circle is "+c.space());
          
          System.out.print("Enter radius of Sphere: ");
          Calc s = new Calc(sc.nextDouble(), "Sphere");
          System.out.println("Creating a Sphere … done!");
          System.out.println("The volume of the Sphere is "+s.space());
     }
}