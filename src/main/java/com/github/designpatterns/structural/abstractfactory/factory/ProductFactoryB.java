package com.github.designpatterns.structural.abstractfactory.factory;

import com.github.designpatterns.structural.abstractfactory.product1.Product1;
import com.github.designpatterns.structural.abstractfactory.product1.Product1B;
import com.github.designpatterns.structural.abstractfactory.product2.Product2;
import com.github.designpatterns.structural.abstractfactory.product2.Product2B;

public class ProductFactoryB implements ProductFactory {

  @Override
  public Product1 createProduct1() {
    return new Product1B();
  }

  @Override
  public Product2 createProduct2() {
    return new Product2B();
  }
}
