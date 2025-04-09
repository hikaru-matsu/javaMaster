package org.example.Object.Chapter9;

public class Vamp {
  String name;
  int hp;
  final int LEVEL = 10;


  public void run() {
    System.out.println(this.name + "は、逃げ出した！！" + "残りのHP:" + this.hp);
  }

  public Vamp(String name, int hp) {
    this.hp = hp;
    this.name = name;
  }
}
