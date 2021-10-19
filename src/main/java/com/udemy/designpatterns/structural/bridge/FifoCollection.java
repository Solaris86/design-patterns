package com.udemy.designpatterns.structural.bridge;

// This is the abstraction
// It represents a First in First out collection
public interface FifoCollection<T> {

    // Adds element to collection
    void offer(T element);

    // Removes & returns first element from collection
    T poll();

}
