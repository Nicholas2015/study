package com.nicholas.designpattern.singleton;

import java.util.Objects;

public class Singleton2 {

    private static Singleton2 singleton = null;

    private Singleton2() {
    }

    public static Singleton2 getInstance(){
        if (Objects.isNull(singleton)){
            singleton = new Singleton2();
        }
        return singleton;
    }
}
