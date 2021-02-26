import java.util.Scanner;
public class Lab1Task11{
     public static void main (String[]args){
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          for (int i=1; i<=n; i++){
               for (int sp=1; sp<=n-i; sp++){
                    System.out.print(" ");
               }
               for (int num=1; num<i*2; num++){
                    if (num==1 || num==i*2-1 || i==n)
                         System.out.print(num);
                    else
                         System.out.print(" ");
               }
               System.out.println();
          }
     }
}