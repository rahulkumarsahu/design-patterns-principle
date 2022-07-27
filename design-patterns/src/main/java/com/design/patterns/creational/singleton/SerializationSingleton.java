package com.design.patterns.creational.singleton;

import java.io.Serializable;

public class SerializationSingleton implements Serializable {

    private static final long serialVersionUID = 1808144385520819134L;
    private static SerializationSingleton instance = null;

    /*
     * private constructor so that
     * preventing instance creation from other class
     */
    private SerializationSingleton() {

    }

    /**
     * This method has global access to return
     * Single instance within JVM
     * @return Singleton Instance
     */
    public static SerializationSingleton getInstance() {
        if (instance == null) {
            instance = new SerializationSingleton();
        }
        return instance;
    }

    /**
     * This method protecting to break singleton
     * by using Serialization process
     * @return return singleton instance
     */
    // overriden method will be called by the JVM
    public Object readResolve() {
        return getInstance();
    }

}
