import java.util.Scanner;
public class Tester{
     public static void main(String[]args){
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter number of students");
          int n = sc.nextInt();
          Student[] ar = new Student[n];
          int i;
          for ( i = 0; i < n; i++ ){
               ar[i] = new Student();
          }
          for ( i = 0; i < n; i++ ){
               System.out.println("Enter student's name");
               ar[i].setName(sc.next());
               System.out.println("Enter student's ID");
               ar[i].setID(sc.nextInt());
               System.out.println("Enter student's address");
               ar[i].setAddress(sc.next());
          }
          for (i = 0; i < n; i++) 
          {
               for (int j = i + 1; j < n; j++) 
               {
                    if (ar[i].getName().compareTo(ar[j].getName())>0) 
                    {
                         String temp = ar[i].getName();
                         ar[i].setName(ar[j].getName()) ;
                         ar[j].setName(temp);
                    }
               }
          }
          System.out.println("Student's List: ");
          for (i = 0; i < n; i++){
               System.out.println(ar[i].getName());
          }
          
          
          
     }
}