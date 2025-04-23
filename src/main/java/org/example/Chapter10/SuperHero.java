package org.example.Chapter10;

public class SuperHero extends Hero{
  //String name = "吾空";
  boolean flying;

  public SuperHero() {
    this.name = "吾空";
    this.hp = 200;
  }

  public void fly() {
    this.flying = true;
    System.out.println("飛び上がった。");
  }

  public void land() {
    this.flying = false;
    System.out.println("着地した！");
  }

  public void run() {
    System.out.println(this.name + "は撤退した。");
  }
}
