package com.udemy.designpatterns.creational.abstractfactory1;

public class S3Storage implements Storage {

    public S3Storage(int capacityInMib) {
        // Use AWS S3 API
        System.out.println("Allocated " + capacityInMib + " on S3");
    }

    @Override
    public String getId() {
        return "S31";
    }

    @Override
    public String toString() {
        return "S3Storage";
    }
}
