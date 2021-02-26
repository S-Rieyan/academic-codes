import java.util.Scanner;
public class Lab1Task25{
     public static void main (String[]args){
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          for (int i=1; i<=n; i++){
               for (int sp=1; sp<=n-i; sp++){
                    System.out.print(" ");
               }
               for (int num=1; num<i*2; num++){
                    if (num==1 || num==i*2-1)
                         System.out.print("*");
                    else
                         System.out.print(" ");
               }
               System.out.println();
          }
          for (int i=n-1; i>0; i--){
               for (int sp=1; sp<=n-i; sp++){
                    System.out.print(" ");
               }
               for (int num=1; num<i*2; num++){
                    if (num==1 || num==i*2-1)
                         System.out.print("*");
                    else
                         System.out.print(" ");
               }
               System.out.println();
          }
     }
}