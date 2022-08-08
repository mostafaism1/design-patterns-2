package com.github.designpatterns.structural.abstractfactory.client;

import com.github.designpatterns.structural.abstractfactory.factory.ProductFactory;
import com.github.designpatterns.structural.abstractfactory.factory.ProductFactoryA;
import com.github.designpatterns.structural.abstractfactory.factory.ProductFactoryB;
import com.github.designpatterns.structural.abstractfactory.product1.Product1;
import com.github.designpatterns.structural.abstractfactory.product2.Product2;

public class Client {

  public static void main(String[] args) {
    ProductFactory productFactory;
    Configuration config = readApplicationConfig();
    if (Configuration.A.equals(config)) {
      productFactory = new ProductFactoryA();
    } else {
      productFactory = new ProductFactoryB();
    }
    Product1 product1 = productFactory.createProduct1();
    Product2 product2 = productFactory.createProduct2();
    System.out.println(product1.doSomething() + '\n' + product2.doSomething());
  }

  private static Configuration readApplicationConfig() {
    return Configuration.A;
  }

  private static enum Configuration {
    A,
    B,
  }
}
