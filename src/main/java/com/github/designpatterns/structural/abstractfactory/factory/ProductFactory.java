package com.github.designpatterns.structural.abstractfactory.factory;

import com.github.designpatterns.structural.abstractfactory.product1.Product1;
import com.github.designpatterns.structural.abstractfactory.product2.Product2;

public interface ProductFactory {
  Product1 createProduct1();
  Product2 createProduct2();
}
