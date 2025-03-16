package org.example;

import java.util.HashMap;
import java.util.Map;

//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか
// ガターの <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
public class Main {

  public static void main(String[] args) {

    int[] numbers = {3, 10, 15, 20, 25, 30};
    findEvenNumbers(numbers);
  }

  private static void findEvenNumbers(int[] numbers) {
    for (int number : numbers) {
      if (number % 2 == 0) {
        System.out.println(number);
      } else {
        System.out.println("偶数が見つかりませんでした。");
      }
    }
  }
}