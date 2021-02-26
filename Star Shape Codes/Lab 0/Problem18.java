import java.util.Scanner;
public class Problem18{
  public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    //int n = 5;
    
    int i, j, k;
    
    for (i=n;i>0;i--){
      for (j=1;j<i;j++) {
      System.out.print(" ");
      }
      for(k=j; k<=n; k++){
        if (k==j||k==n){
          System.out.print("*");
        }
        else{
          System.out.print(" ");
        }
      }
      System.out.println();
    }
    for (i=1; i<=n; i++){
    System.out.print("*");
    }
    } 
   }
 