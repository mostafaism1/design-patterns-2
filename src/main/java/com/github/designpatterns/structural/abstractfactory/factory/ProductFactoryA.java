package com.github.designpatterns.structural.abstractfactory.factory;

import com.github.designpatterns.structural.abstractfactory.product1.Product1;
import com.github.designpatterns.structural.abstractfactory.product1.Product1A;
import com.github.designpatterns.structural.abstractfactory.product2.Product2;
import com.github.designpatterns.structural.abstractfactory.product2.Product2A;

public class ProductFactoryA implements ProductFactory {

  @Override
  public Product1 createProduct1() {
    return new Product1A();
  }

  @Override
  public Product2 createProduct2() {
    return new Product2A();
  }
}
