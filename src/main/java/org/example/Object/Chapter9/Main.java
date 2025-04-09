package org.example.Object.Chapter9;

public class Main {

  public static void main(String[] args) {

    Red red = new Red("サンレッド", 1500);
    System.out.println("名前:" + red.name + " HP:" + red.hp);
    Sunshoot sunshoot = new Sunshoot();

    red.name = "サンレッド";
    sunshoot.name = "サンシュート";
    sunshoot.damage = 10;

    Vamp vamp = new Vamp("ヴァンプ将軍", 1000);
    System.out.println("名前:" + vamp.name + " HP:" + vamp.hp);

    red.slip();
    System.out.println("現れたな！" + red.name);
    red.attack();
    System.out.println("現在の武器は、" + sunshoot.name);
    vamp.run();
  }

}
