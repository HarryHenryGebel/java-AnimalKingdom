package tech.gebel.animalkingdom;

public class Bird extends Animal {

  public Bird(int yearNamed, String name) {
    super(yearNamed, name);
    // set unassigned values from abstract class
    reproductionType = "eggs";
    respirationType = "lungs";
    movementType = "fly";
    className = "Bird";
  }
}
