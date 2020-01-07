package com.nicholas.designpattern.prototype.framework;

public interface Product extends Cloneable{

    public  void use(String name);

    public  Product createClone();
}
