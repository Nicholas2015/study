package com.nicholas.designpattern.prototype;

import com.nicholas.designpattern.prototype.framework.Manager;
import com.nicholas.designpattern.prototype.framework.Product;

public class Main {

    public static void main(String[] args) {
        Manager manager = new Manager();

        UnderlinePen underlinePen = new UnderlinePen('~');
        MessageBox messageBox = new MessageBox('*');

        manager.register("underline",underlinePen);
        manager.register("messageBox",messageBox);

        Product product1 = manager.create("underline");
        Product product2 = manager.create("messageBox");

        product1.use("Hello，World!");
        product2.use("Hello，World!");
    }
}
