package com.github.designpatterns.structural.factorymethod.client;

import com.github.designpatterns.structural.factorymethod.creator.Creator;
import com.github.designpatterns.structural.factorymethod.creator.CreatorA;
import com.github.designpatterns.structural.factorymethod.creator.CreatorB;

public class Client {

  public static void main(String[] args) {
    Creator creator;
    Configuration config = readApplicationConfig();
    if (Configuration.A.equals(config)) {
      creator = new CreatorA();
    } else {
      creator = new CreatorB();
    }
    String result = creator.doSomethingWithProduct();
    System.out.println(result);
  }

  private static Configuration readApplicationConfig() {
    return Configuration.A;
  }

  private static enum Configuration {
    A,
    B,
  }
}
