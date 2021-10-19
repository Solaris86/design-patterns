package com.udemy.designpatterns.creational.abstractfactory1;

public class GoogleResourceFactory implements ResourceFactory {
    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new GoogleComputeEngineInstance(capacity);
    }

    @Override
    public Storage createStorage(int capInMib) {
        return new GoogleCloudStorage(capInMib);
    }
}
