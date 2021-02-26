public class Animal {

  //Name of the Animal
  private String sound = "Animal Sound";

  //Default Constructor
  public Animal(){
  }

  //Overloaded Constructor
  Animal(String sound){
    this.sound = sound;
  }

  //Return sound
  public String makeSound(){
    return sound;
  }
}
