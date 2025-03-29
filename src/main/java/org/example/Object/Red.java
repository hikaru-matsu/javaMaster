package org.example.Object;

public class Red {
  String name;
  int hp;

  public void attack() {

  }

  public void sleep() {
   this.hp = 100;
   System.out.println(this.name + "は眠って回復した。");
  }

  public void slip() {
    this.hp -= 5;
    System.out.println("５のダメージだ！！");
    System.out.println("残りHP:"+ this.hp);
  }

  public void run() {
    System.out.println(this.name + "は、逃げ出した。");
    System.out.println("GAME OVER!!");
  }
}
