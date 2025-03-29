package org.example.Object.Chpter8Assign;

public class Cleric {

  String name;
  int HP = 50;
  final int MaxHP = 50;
  int MP = 10;
  final int MaxMP =10;

  public void selfAid() {
    MP -= 5;
    HP = MaxHP;
    System.out.println("現在のHP：" + this.HP);
  }

  public void pray() {
    MP += 2;
    System.out.println("現在のMP：" + this.MP);
  }

}
