class Vehicle2010 extends Vehicle{
  public void moveUpperRight(){
    super.moveUp();
    super.moveRight();
  }
  public void moveUpperLeft(){
    super.moveUp();
    super.moveLeft();
  }
  public void moveLowerRight(){
    super.moveDown();
    super.moveRight();
  }
  public void moveLowerLeft(){
    super.moveDown();
    super.moveLeft();
  }
  public boolean equals(Vehicle2010 obj){
    if ( obj.x == x && obj.y == y )
      return true;
    else
      return false;
  }
}