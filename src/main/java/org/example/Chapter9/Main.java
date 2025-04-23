package org.example.Chapter9;

public class Main {

  public static void main(String[] args) {
    Thief thief = new Thief("めぐみん",120, 100);
    System.out.println("名前：" + thief.name + " HP:"+ thief.hp + " MP:" + thief.mp);

    Thief thief_2 = new Thief("かずま", 30);
    System.out.println("名前：" + thief_2.name + " HP:"+ thief_2.hp + " MP:" + thief_2.mp);
  }
}
