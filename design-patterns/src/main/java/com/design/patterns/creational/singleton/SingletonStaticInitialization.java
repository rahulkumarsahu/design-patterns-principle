package com.design.patterns.creational.singleton;

public class SingletonStaticInitialization {

    private static SingletonStaticInitialization instance = null;

    /*
     * private constructor so that
     * preventing instance creation from other class
     */
    private SingletonStaticInitialization() {

    }

    static {
        try {
            if(instance == null) {
                instance = new SingletonStaticInitialization();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * This method has global access to return
     * Single instance within JVM
     * @return Singleton Instance
     */
    public static SingletonStaticInitialization getInstance() {
        return instance;

    }
}
