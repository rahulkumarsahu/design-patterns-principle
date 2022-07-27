package com.design.patterns.creational.singleton;

public class MyThread implements Runnable {

    @Override
    public void run() {
        SingletonThreadSafe singleton  = null;
        try {
            singleton = SingletonThreadSafe.getInstance();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName()+" "+singleton.hashCode());
    }

}
