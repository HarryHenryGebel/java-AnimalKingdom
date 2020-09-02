package tech.gebel.animalkingdom;

public class Main {

  public static void main(String[] args) {
    Mammal panda = new Mammal(1869, "Panda");
    Mammal zebra = new Mammal(1778, "Zebra");
    Mammal koala = new Mammal(1816, "Koala");
    Mammal sloth = new Mammal(1804, "Sloth");
    Mammal armadillo = new Mammal(1758, "Armadillo");
    Mammal racoon = new Mammal(1758, "Raccoon");
    Mammal bigfoot = new Mammal(2021, "Bigfoot");

    Bird pigeon = new Bird(1837, "Pigeon");
    Bird peacock = new Bird(1821, "Peacock");
    Bird toucan = new Bird(1758, "Toucan");
    Bird parrot = new Bird(1824, "Parrot");
    Bird swan = new Bird(1758, "Swan");

    Fish salmon = new Fish(1758, "Salmon");
    Fish catfish = new Fish(1817, "Catfish");
    Fish perch = new Fish(1758, "Perch");
  }
}
