package tech.gebel.animalkingdom;

public class Fish extends Animal {

  public Fish(int yearNamed, String name) {
    super(yearNamed, name);
    // set unassigned values from abstract class
    reproductionType = "eggs";
    respirationType = "gills";
    movementType = "swim";
  }
}
