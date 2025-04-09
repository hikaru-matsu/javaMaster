package org.example.Object;

public class Book {
  String title;
  String author;

  public Book(String title, String author) {
    this.title = title;
    this.author = author;
  }

 public void printInfo() {
   System.out.println("この本のタイトルは、" + this.title + "著者は" + this.author);
  }
}
