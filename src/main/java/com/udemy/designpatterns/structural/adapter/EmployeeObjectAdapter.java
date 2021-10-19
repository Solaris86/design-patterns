package com.udemy.designpatterns.structural.adapter;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class EmployeeObjectAdapter implements Customer {

    private final Employee adaptee;

    @Override
    public String getName() {
        return adaptee.getFullName();
    }

    @Override
    public String getDesignation() {
        return adaptee.getJobTitle();
    }

    @Override
    public String getAddress() {
        return adaptee.getOfficeLocation();
    }
}
