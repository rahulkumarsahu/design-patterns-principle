package com.design.patterns.creational.singleton;

public class SingletonThreadSafe {

    private static volatile SingletonThreadSafe instance = null;

    private SingletonThreadSafe() {

    }
    // synchronized we can use in method but only we want synchronized keyword when we create object only
    public static SingletonThreadSafe getInstance1() throws InterruptedException {
        if (instance == null) {
            synchronized (SingletonThreadSafe.class) {
                if (instance == null) {
                    Thread.sleep(2000);
                    instance = new SingletonThreadSafe();
                }
            }
        }
        return instance;

    }
    // this is how it is broken in multithreaded environment
    // here if we have lots of code then singleton creation of object is breaking
    public static SingletonThreadSafe getInstance() throws InterruptedException {
        if (instance == null) {
            Thread.sleep(2000);
            instance = new SingletonThreadSafe();
        }

        return instance;
    }



}
