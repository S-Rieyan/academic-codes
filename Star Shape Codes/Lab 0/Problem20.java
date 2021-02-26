import java.util.Scanner;
public class Problem20{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    for(int row=0;row<r;row++){
      for(int space=r;space>row;space--){
      System.out.print(" ");
      }
      for(int num = 1;num<=(row*2)+1;num++){
           if ( row==0 || row==r-1 || num==1 || num==(row*2)+1  ) 
                System.out.print("*");
           else
                System.out.print(" ");
      }
    System.out.println();
  }
}
}