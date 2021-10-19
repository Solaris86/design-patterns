package com.udemy.designpatterns.creational.singleton;

public class LazyRegistryWithDCL {

    private static volatile LazyRegistryWithDCL INSTANCE;

    private LazyRegistryWithDCL() {}

    public static LazyRegistryWithDCL getInstance() {
        if (INSTANCE == null) {
            synchronized (LazyRegistryWithDCL.class) {
                if (INSTANCE == null) {
                    INSTANCE = new LazyRegistryWithDCL();
                }
            }
        }

        return INSTANCE;
    }
}
