package com.nicholas.designpattern.prototype.framework;

import java.util.HashMap;
import java.util.Map;

public class Manager {

    Map<String,Object> showcase = new HashMap<String,Object>();

    public void register(String name,Product proto){
        showcase.put(name,proto);
    }

    public Product create(String protoName){
        Product product = (Product) showcase.get(protoName);
        return product.createClone();
    }
}
