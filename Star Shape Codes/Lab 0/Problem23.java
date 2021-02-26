import java.util.Scanner;
public class Problem23{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    for(int row=1;row<r;row++){
         
      for(int space=r;space>=row+1;space--){
           
           System.out.print(" ");
      }
      for(int num = 1;num<(row*2)+1;num++){
           if ( row==0 || num==1 || num==(row*2-1)  ) 
                System.out.print(num);
           else
                System.out.print(" ");
      }
     
      System.out.println();
    }
    
    for ( int row = 0 ; row <= r-1 ; row++){
      for ( int space = 1; space <= row ; space++ ){
        System.out.print (" ");
    }
      for ( int j = 1; j <= (r-row)*2-1; j++ ){
           if ( row == r-1 || j == (r-row)*2-1 || j == 1)
                System.out.print(j);  
           else 
                System.out.print(" ");
      }
      System.out.println ();
  }
}
}