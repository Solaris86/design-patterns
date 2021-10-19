package com.udemy.designpatterns.creational.abstractfactory1;

public class EC2Instance implements Instance {

    public EC2Instance(Capacity capacity) {
        // Map capacity to EC2 instance types. Usw AWS API to provision
        System.out.println("Created EC2Instance");
    }

    @Override
    public void start() {
        System.out.println("EC2Instance created");
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println("Attached " + storage + " to EC2Instance");
    }

    @Override
    public void stop() {
        System.out.println("EC2Instance stopped");
    }

    @Override
    public String toString() {
        return "EC2Instance";
    }
}
