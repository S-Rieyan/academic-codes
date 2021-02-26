class Car{
    static int c = 0;
    int year;
   
    Car(int y){
        year = y;
        c++;
    }
    int getYear(){
        return year;
    }
    static int getObjectCount(){
        return c;
    }
}
