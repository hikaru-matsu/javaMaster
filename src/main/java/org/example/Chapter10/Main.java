package org.example.Chapter10;

public class Main {
  public static void main(String[] args) {
    SuperHero Goku = new SuperHero();
    Goku.run();
    Hero Gohan = new Hero();
    Gohan.run();
    Matango m = new Matango();

    Goku.attack(m);
    Goku.fly();
    System.out.println(Goku.hp);
  }
}
