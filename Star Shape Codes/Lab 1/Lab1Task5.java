import java.util.Scanner;
public class Lab1Task5{
  
    public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
   
    int r = sc.nextInt();
   
    int i, j, k;
      
    
    for(i=r; i>0; i--){
        
        for(j=1; j<=i-1; j++){
          
            System.out.print(" ");
            
        }
        
        for(k=i-j+1; k<=r-i+1; k++){
          
            System.out.print(k);
        
        }
        
        System.out.println();
  
      }

    }
}