import java.util.Scanner;
public class Problem15{
  public static void main (String[]args){
    
    Scanner sc = new Scanner(System.in);
   
    int l = sc.nextInt();
    int w = sc.nextInt();
 
    
    int i, j;
    
    for (i=1; i<=w; i++){
    
      System.out.print(i);
      
    }
    
    System.out.println();
    
    for (i=1; i<=l-2;i++){
      for(j=1;j<=w;j++)
      {
        if(j==1 || j==w)
          System.out.print(j);
        else
          System.out.print(" ");
      }
      System.out.println();
    }
    
    
    for (i=1; i<=w; i++){
    
      System.out.print(i);
      
    }
    
      
    }

  }
