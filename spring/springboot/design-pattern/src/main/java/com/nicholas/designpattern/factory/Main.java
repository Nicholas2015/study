package com.nicholas.designpattern.factory;

import com.nicholas.designpattern.factory.framework.Factory;
import com.nicholas.designpattern.factory.framework.Product;
import com.nicholas.designpattern.factory.idcard.IDCardFactory;

public class Main {

    public static void main(String[] args) {
        Factory factory = new IDCardFactory();

        Product product1 = factory.create("james");
        Product product2 = factory.create("micheal");

        product1.use();
        product2.use();
    }
}
