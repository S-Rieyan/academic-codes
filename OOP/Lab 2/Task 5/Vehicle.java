class Vehicle{
  int x = 0;
  int y = 0;
  
  public void moveUp(){
    y = y + 1;
  }
  public void moveDown(){
    y = y - 1;
  }
  public void moveLeft(){
    x = x - 1;
  }
  public void moveRight(){
    x = x + 1;
  }
  public String toString(){
    return "("+x+", "+y+")";
  }
}