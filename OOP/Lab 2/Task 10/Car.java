class Car{
  int year;
  static int count;
  
  public Car(int y){
    year = y;
    count++;
  }
  public int getYear(){
    return year;
  }
  public static int getObjectCount(){
    return count;
  }
}