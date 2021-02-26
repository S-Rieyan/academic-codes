import java.util.Scanner;
public class Problem24{
    public static void main (String[]args){
    
   Scanner sc = new Scanner(System.in);
   
    int l = sc.nextInt();
    
 
    
    int i, f=0;
    for(i=1;i!=0;){
      if(f==0){
      System.out.print(i++);
      }
      else if(f!=0){
        
        System.out.print(i--);
        
      }
      
      if(i==l){
        f++;
      }
    }
    
}
    
}