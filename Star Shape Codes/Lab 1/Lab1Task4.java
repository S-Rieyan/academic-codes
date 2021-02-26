import java.util.Scanner;
public class Lab1Task4{
  
    public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
   
    int r = sc.nextInt();
   
    int i, j, k;
      
    
    for(i=r; i>0; i--){
        
        for(j=1; j<=i-1; j++){
          
            System.out.print(" ");
            
        }
        
        for(k=j; k<=r; k++){
          
            System.out.print(k);
        
        }
        
        System.out.println();
  
      }

    }
}