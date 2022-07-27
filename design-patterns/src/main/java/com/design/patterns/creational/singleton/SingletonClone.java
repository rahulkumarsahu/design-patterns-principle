package com.design.patterns.creational.singleton;

// how to break singleton using clone
public class SingletonClone implements Cloneable {

    private static SingletonClone instance = null;

    /*
     * private constructor so that
     * preventing instance creation from other class
     */
    private SingletonClone() {

    }

    /**
     * This method has global access to return
     * Single instance within JVM
     * @return Singleton Instance
     */
    public static SingletonClone getInstance() {
        //If Instance is null then only instantiate
        if (instance == null) {
            instance = new SingletonClone();
        }
        return instance;

    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        // prevent
        //throw  new CloneNotSupportedException("can not clone singleton");
        return super.clone();
    }
}
