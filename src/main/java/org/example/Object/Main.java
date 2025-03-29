package org.example.Object;

public class Main {

  public static void main(String[] args) {

    Red red = new Red();
    red.name = "サンレッド";
    red.hp = 1500;

    Vamp vamp = new Vamp();
    vamp.name = "ヴァンプ将軍";

    red.slip();

    System.out.println("現れたな！" + red.name);

    vamp.run();
  }

}
