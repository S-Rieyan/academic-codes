public class Dog extends Animal implements SoundSource{
     Dog (String n){super(n);}
     public void makeSound(){System.out.println(getName()+" is crying");}
}