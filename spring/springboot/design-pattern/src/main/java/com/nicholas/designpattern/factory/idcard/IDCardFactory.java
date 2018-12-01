package com.nicholas.designpattern.factory.idcard;

import com.nicholas.designpattern.factory.framework.Factory;
import com.nicholas.designpattern.factory.framework.Product;

import java.util.ArrayList;
import java.util.List;

public class IDCardFactory extends Factory {

    private List owners = new ArrayList();

    @Override
    protected void registerProduct(Product product) {
        owners.add(((IDCard)product).getOwner());
    }

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }
}
