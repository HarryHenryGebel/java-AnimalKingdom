package tech.gebel.animalkingdom;

public abstract class Animal {
  private static int maximumId = 0;
  protected int id, yearNamed;
  protected String name, reproductionType, respirationType, movementType;

  public Animal(int yearNamed, String name) {
    maximumId++;
    id = maximumId;
    this.yearNamed = yearNamed;
    this.name = name;
  }
}
//  LocalWords:  yearNamed
