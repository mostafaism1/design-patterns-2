package com.github.designpatterns.structural.factorymethod.creator;

import com.github.designpatterns.structural.factorymethod.product.Product;
import com.github.designpatterns.structural.factorymethod.product.ProductA;

public class CreatorA extends Creator {

  @Override
  public Product createProduct() {
    return new ProductA();
  }
  
}
