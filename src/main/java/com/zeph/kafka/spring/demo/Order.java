package com.zeph.kafka.spring.demo;

public class Order {

  private String title;

  public Order() {
  }

  public Order(String title) {
    this.title = title;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }
}
