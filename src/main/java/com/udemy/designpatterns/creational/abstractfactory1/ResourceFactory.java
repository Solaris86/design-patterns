package com.udemy.designpatterns.creational.abstractfactory1;

// Abstract factory with methods defined for each object
public interface ResourceFactory {

    Instance createInstance(Instance.Capacity capacity);

    Storage createStorage(int capInMib);

}
