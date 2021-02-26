import java.util.Scanner;
public class Lab1Task10{
     
     public static void main (String[]args){
          Scanner sc = new Scanner(System.in);
          
          int r = sc.nextInt();
          
          int i, j, k;
          
          
          for(i=r; i>0; i--){
               
               for(j=1; j<=i-1; j++){
                    
                    System.out.print(" ");
                    
               }
               
               for(k=j; k<=r; k++){
                    if (i==r || i==1 || k==i || k==r)
                         System.out.print(k);
                    else
                         System.out.print(" ");
                    
               }
               
               System.out.println();
               
          }
          
     }
}