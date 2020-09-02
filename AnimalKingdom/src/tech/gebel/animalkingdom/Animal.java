package tech.gebel.animalkingdom;

import java.util.ArrayList;

public abstract class Animal {
  private static int maximumId = 0;
  private static ArrayList<Animal> instances = new ArrayList<Animal>();
  protected int id, yearNamed;
  protected String name, reproductionType, respirationType, movementType;

  public Animal(int yearNamed, String name) {
    maximumId++;
    id = maximumId;
    this.yearNamed = yearNamed;
    this.name = name;
    instances.add(this);
  }

  public String toString() {
    return String.format(
      "Animals{id=%d, name=%s, yearNamed=%d}",
      id,
      name,
      yearNamed
    );
  }

  public String reproduce() {
    return reproductionType;
  }

  public String breath() {
    return respirationType;
  }

  public String move() {
    return movementType;
  }
}
//  LocalWords:  yearNamed
