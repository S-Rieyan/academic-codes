import java.util.Scanner;
public class Problem13{
  public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
   
    int r = sc.nextInt();
   
    int i, j, k,f=1;
      
    
    for(i=r-1; i>0; i--)
    {
      for(j=0;j<i;j++)
      {
        System.out.print(" ");
      }
      
        for(k=1;k<=f*2-1;k++){
        System.out.print(k);
        
        }
      f++;
      System.out.println();
  }   
      for(i=1;i<=r*2-1;i++)
      {
        System.out.print(i);
      }
      
      System.out.println();
      f=1;
      
       for(i=1; i<=r-1; i++)
    {
      for(j=1;j<=i;j++)
      {
        System.out.print(" ");
      }
      
        for(k=1;k<=(r-i)*2-1;k++){
        System.out.print(k);
        
        }
      f++;
      System.out.println();
  }
    }
  }



