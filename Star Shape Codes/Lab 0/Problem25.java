import java.util.Scanner;
public class Problem25{
    public static void main (String[]args){
    
   Scanner sc = new Scanner(System.in);
   
    int l = sc.nextInt();
    
 
    
    int i,k, j, f=0;
    for(j=1; j<=l; j++){
      
      for(k=l-j;k>0;k--)
      {
        System.out.print(" ");
      
      }
    
      for(i=1;i!=0;){
      
        if(i==j){
          f++;
        }
        
        if(f==0){
          System.out.print(i++);
        }
        else if(f!=0){
        
          System.out.print(i--);
        
      }
      
      
      }
      System.out.println();
      f=0;
    }
    
    
}
    }
