package com.udemy.designpatterns.creational.abstractfactory1;

public interface Instance {

    enum Capacity {
        micro, small, large
    }

    void start();
    void attachStorage(Storage storage);
    void stop();

}
