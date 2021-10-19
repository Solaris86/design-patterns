package com.udemy.designpatterns.creational.singleton;

public class EagerRegistry {

    private static final EagerRegistry INSTANCE = new EagerRegistry();

    private EagerRegistry() {}

    protected static EagerRegistry getInstance() {
        return INSTANCE;
    }

}
