class Vehicle2010 extends Vehicle{
     void moveUpperRight(){moveRight(); moveUp();}
     void moveUpperLeft(){moveLeft(); moveUp();}
     void moveLowerRight(){moveRight(); moveDown();}
     void moveLowerLeft(){moveLeft(); moveDown();}
     
     boolean equals(Vehicle2010 ob){
          if (ob.x==x && ob.y==y)
               return true;
          else
               return false;
     } 
}