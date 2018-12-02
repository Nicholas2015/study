package com.nicholas.designpattern.prototype;

import com.nicholas.designpattern.prototype.framework.Product;

public class UnderlinePen implements Product {

    private char dechar;

    public UnderlinePen(char dechar) {
        this.dechar = dechar;
    }

    @Override
    public void use(String name) {
        int width = name.getBytes().length;
        System.out.print("\"" + name + "\"");
        System.out.println(" ");
        for (int i = 0; i < width; i++){
            System.out.print(this.dechar);
        }
        System.out.println();
    }

    @Override
    public Product createClone() {
        try {
            Product product = (Product) clone();
            return product;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
