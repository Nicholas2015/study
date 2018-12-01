package com.nicholas.designpattern.factory.framework;

public abstract class Factory {

    public final Product create(String owner){
        Product product = createProduct(owner);
        registerProduct(product);
        return product;
    }

    protected abstract void registerProduct(Product product);

    protected abstract Product createProduct(String owner);
}
