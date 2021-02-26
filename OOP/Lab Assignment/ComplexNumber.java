public class ComplexNumber extends RealNumber{
   double complexValue;
   ComplexNumber(double r, double c){
         setRealValue(r);
        complexValue = c;
   }
   ComplexNumber(){
         setRealValue(1);
        complexValue = 1;
   }
    public String toString() {
        return "RealPart: "+getRealValue()+"\nImaginaryPart: "+complexValue;
    }
   void check(){
         ping();
         System.out.println("I'm in ComplexNumber class\nChecking ended.");
    }
}
