package com.github.designpatterns.structural.factorymethod.creator;

import com.github.designpatterns.structural.factorymethod.product.Product;
import com.github.designpatterns.structural.factorymethod.product.ProductB;

public class CreatorB extends Creator {

  @Override
  public Product createProduct() {
    return new ProductB();
  }
}
