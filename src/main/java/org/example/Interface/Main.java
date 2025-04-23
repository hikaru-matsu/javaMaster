package org.example.Interface;

//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか
// ガターの <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
public class Main {

  public static void main(String[] args) {

    Runnable[] runners = {new Car(), new Dog()};
    for (Runnable r : runners) {
      r.run();
    }
  }
}

  interface Runnable {
    void run();
  }

  class Car implements Runnable {
    public void run() {
      System.out.println("車が走る。");
    }
  }

  class Dog implements Runnable {
    public void run() {
      System.out.println("犬が走る！");
  }
}
