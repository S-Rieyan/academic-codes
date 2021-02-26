public class ComplexNumber extends RealNumber{
  double complexValue;
  
  ComplexNumber(){
    setRealValue(1);
    complexValue = 1;
  }
  
  ComplexNumber(double real,double cx){
    setRealValue(real);
    complexValue = cx;
  }
  
  public String toString(){
    return "RealPart: "+getRealValue()+"\nImaginaryPart: "+complexValue;
  }
  void check(){
    ping();
    System.out.println("I'm in ComplexNumber class\nChecking ended.");
    
  }
}