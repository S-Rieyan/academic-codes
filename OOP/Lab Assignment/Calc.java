class Calc extends Point
{
     String name;
     Calc(double r, String n){
          super(r);
          name = n;
     }
     double space(){
          double x = 0;
          if (name.equals("Circle")) 
               x = Math.PI*getRadius()*getRadius();
          else if (name.equals("Sphere")) 
               x = 4.0/3.0*Math.PI*getRadius()*getRadius()*getRadius();
          return x;
     }
     
}