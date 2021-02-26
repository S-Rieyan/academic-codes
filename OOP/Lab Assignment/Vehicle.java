class Vehicle{
     int x = 0;
     int y = 0;
     void moveUp(){y++;}
     void moveLeft(){x--;}
     void moveDown(){y--;}
     void moveRight(){x++;}
     
     public String toString(){return "("+x+", "+y+")";}
}