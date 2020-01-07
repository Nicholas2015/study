package com.nicholas.designpattern.prototype;

import com.nicholas.designpattern.prototype.framework.Product;

public class MessageBox implements Product {

    private char ulchar;

    public MessageBox(char ulchar) {
        this.ulchar = ulchar;
    }

    @Override
    public void use(String name) {
        int width = name.getBytes().length;
        for (int i = 0; i < width + 4; i++){
            System.out.print(this.ulchar);
        }
        System.out.println();
        System.out.println(this.ulchar + " " + name + " " + this.ulchar);
        for (int i = 0; i < width + 4; i++){
            System.out.print(this.ulchar);
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
