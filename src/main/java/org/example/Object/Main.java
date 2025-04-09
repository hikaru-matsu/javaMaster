package org.example.Object;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.example.Object.Chpter8Assign.Student;

public class Main {
  public static void main(String[] args) {
    Book book = new Book("このすば", "暁なつめ");
    book.printInfo();

    Map<String ,Integer> map = new HashMap<>();
    map.put("めぐみん",100);
    map.put("かずま",59);
    map.put("アクア",45);
    map.put("ゆんゆん",90);
    map.put("ダクネス",70);

    Student student = new Student();

    map.forEach((name, score) -> {
      String result = student.isPassed(score);
      System.out.println(name + "さんは、" + result + "です。");
    });
  }
}
