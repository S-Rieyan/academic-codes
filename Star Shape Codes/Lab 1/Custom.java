import java.util.Scanner;
public class Custom{
     public static void main (String []args){
          Scanner sc = new Scanner (System.in);
          int n = sc.nextInt();
          int a=65;
          int sp;
          for (int i=1; i<=n; i++) {
               for (sp=1; sp<i*2-1; sp++)
                    System.out.print(" ");
               for (int num=i+sp/2 ; num<n*2; a++, num+=2){
                    char l = (char)a;
                    System.out.print(l);
                    System.out.print(num);
               } 
               System.out.println();
          }
     }
}