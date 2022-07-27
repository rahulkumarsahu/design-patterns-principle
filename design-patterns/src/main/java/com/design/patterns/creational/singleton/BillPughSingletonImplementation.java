package com.design.patterns.creational.singleton;

public class BillPughSingletonImplementation {

    private BillPughSingletonImplementation() {

    }
     // when singleton class is loaded then inner class will not be loaded
    // when we call that method then static class will be loaded so optimized lazy loading and completely thread safe.
    private static class SingletonHolder {
        private static final BillPughSingletonImplementation INSTANCE = new BillPughSingletonImplementation();
    }

    public static BillPughSingletonImplementation getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
