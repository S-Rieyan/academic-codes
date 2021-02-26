abstract class Instrument{
    abstract void play();
    abstract void adjust();
    void compose(){
        System.out.println("Composing method of Instruments");
    }
}