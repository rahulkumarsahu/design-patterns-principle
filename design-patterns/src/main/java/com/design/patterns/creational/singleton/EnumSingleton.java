package com.design.patterns.creational.singleton;

// it will not allow lazy
public enum EnumSingleton {

    /**
     * This Singleton can be access globally
     */
    GET_INSTANCE;

    public String welcome() {
        return "Singleton!!";
    }

}
