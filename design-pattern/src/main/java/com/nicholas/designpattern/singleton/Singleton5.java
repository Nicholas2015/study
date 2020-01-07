package com.nicholas.designpattern.singleton;

public class Singleton5 {

    private boolean initialized = false;

    private Singleton5(){
        synchronized (Singleton5.class){
            if (initialized == false){
                initialized = !initialized;
            }else {
                throw new RuntimeException("单例已被侵犯");
            }
        }
    }

    /**
     * static 是为了使单列空间共享
     * final保证了不会重写重载
     * @return
     */
    public static final Singleton5 getInstance(){
        //返回结果前先加载内部类
        return LazyHolder.LAZY;
    }

    /**
     * 默认不加载
     */
    private static class LazyHolder{
        private static final Singleton5 LAZY = new Singleton5();
    }
}
