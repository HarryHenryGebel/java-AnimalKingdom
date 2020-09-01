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

  public String toString() {
    return String.format(
      "Animals{id=%d, name=%s, yearNamed=%d}",
      id,
      name,
      yearNamed
    );
  }
}
//  LocalWords:  yearNamed
