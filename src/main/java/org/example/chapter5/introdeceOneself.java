package org.example.chapter5;

import java.util.Scanner;

public class introdeceOneself {

  public static void introduce() {
    String name;
    int age;
    Double height;
    String Eto;
    Scanner scanner = new Scanner(System.in);
    System.out.println("名前を入力してください。");
    name = scanner.nextLine();

    System.out.println("年齢を入力してください。");
    age = scanner.nextInt();

    System.out.println("身長を入力してください。");
    height = scanner.nextDouble();

    System.out.println("干支を入力してください");
    Eto = scanner.next();
    System.out.println("名前:" + name + "," + "年齢:" + age + "身長:" + height + "干支:" + Eto);
  }

  public static void main(String[] args) {
    introdeceOneself intro = new introdeceOneself();
    intro.introduce();

  }
}
