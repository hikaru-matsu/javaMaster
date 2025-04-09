package org.example.Object.Chpter8Assign;

public class Student {
  String name;
  int score;


  public String getName() {
    return this.name;
  }

  public int getScore() {
    return this.score;
  }

  public String isPassed(int score) {
    if(score >= 60) {
      return "合格";
    } else {
      return "不合格";
    }
  }

}
