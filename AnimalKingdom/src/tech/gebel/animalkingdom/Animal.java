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
      "Animals{id=%d, name=%s, yearNamed=%d}%n",
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

  public static ArrayList<Animal> sortByYear(boolean ascending) {
    ArrayList<Animal> clone = new ArrayList<Animal>(instances);
    if (ascending) clone.sort(
      (animal1, animal2) -> animal1.yearNamed + animal2.yearNamed
    ); else clone.sort(
      (animal1, animal2) -> animal2.yearNamed - animal1.yearNamed
    );
    return clone;
  }
}
//  LocalWords:  yearNamed
