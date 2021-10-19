package com.udemy.designpatterns.creational.abstractfactory1;

public class GoogleCloudStorage implements Storage {

    public GoogleCloudStorage(int capacityInMb) {
        // Use GCP API
        System.out.println("Allocated " + capacityInMb + " on Google Cloud Storage");
    }

    @Override
    public String getId() {
        return "gcps1";
    }

    @Override
    public String toString() {
        return "Google cloud storage";
    }
}
