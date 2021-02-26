import java.util.Scanner;
public class Problem21{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    for(int row=0;row<r;row++){
      for(int space=r;space>row;space--){
      System.out.print(" ");
      }
      for(int col = 1;col<=(row*2)+1;col++){
           if ( row==0 || row==r-1 || col==1 || col==(row*2)+1  ) 
                System.out.print(col);
           else
                System.out.print(" ");
      }
    System.out.println();
  }
}
}