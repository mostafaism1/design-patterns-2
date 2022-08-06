package com.github.designpatterns.structural.factorymethod.creator;

import com.github.designpatterns.structural.factorymethod.product.Product;

public abstract class Creator {

  // A factory method for Products.
  public abstract Product createProduct();

  public String doSomethingWithProduct() {
    return createProduct().doSomething();
  }
}
