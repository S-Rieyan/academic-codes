class ChildSub extends Point{
  String name;
  ChildSub(double x){
    super(x);
  }
  void setName(String n){
    name = n;
  }
  double space(){
    double r = 0;
    if ( name == "Circle")
      r = Math.PI*getRadius()*getRadius();
    else
      r = (4.0/3.0)*Math.PI*getRadius()*getRadius()*getRadius();
    return r;
  }
}