package com.nicholas.designpattern.singleton;

import java.util.Objects;

/**
 * 双检锁/双重校验锁（DCL，即 double-checked locking）
 * JDK 版本：JDK1.5 起
 *
 * 是否 Lazy 初始化：是
 *
 * 是否多线程安全：是
 *
 * 实现难度：较复杂
 *
 * 描述：这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
 * getInstance() 的性能对应用程序很关键。
 */
public class Singleton4 {

    private static Singleton4 singleton = null;

    private Singleton4() {
    }

    public static Singleton4 getInstance(){
        if (Objects.isNull(singleton)){
            synchronized (Singleton4.class){
                if (Objects.isNull(singleton)) {
                    singleton = new Singleton4();
                 }
                }
        }
        return singleton;
    }
}
