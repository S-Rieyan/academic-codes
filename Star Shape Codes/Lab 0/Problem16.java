import java.util.Scanner;
public class Problem16{
  public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
   // int n = 5;
    int i, j;
    for (i=2; i<=n; i++){
      for (j=1; j<=i; j++){
        if (j==1||j==i-1){
          System.out.print("*");
        }
        else{
         System.out.print(" "); 
        }
      }
      System.out.println();
      
    }
    for (i=1; i<=n; i++) {
      System.out.print("*");
    }
    
   }
}