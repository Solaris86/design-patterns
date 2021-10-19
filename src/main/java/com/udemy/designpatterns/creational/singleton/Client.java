package com.udemy.designpatterns.creational.singleton;

public class Client {

    public static void main(String[] args) {
//        EagerRegistry instance = EagerRegistry.getInstance();
//        EagerRegistry instance2 = EagerRegistry.getInstance();
//        System.out.println(instance == instance2);
//
//        LazyRegistryWithDCL lazySingleton1 = LazyRegistryWithDCL.getInstance();
//        LazyRegistryWithDCL lazySingleton2 = LazyRegistryWithDCL.getInstance();
//        System.out.println(lazySingleton1 == lazySingleton2);

        LazyRegistryIODH singleton;
        singleton = LazyRegistryIODH.getInstance();
        singleton = LazyRegistryIODH.getInstance();
        singleton = LazyRegistryIODH.getInstance();
    }

}
