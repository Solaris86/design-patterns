package com.udemy.designpatterns.creational.factory;

import com.udemy.designpatterns.creational.factory.message.Message;

public class Client {

    public static void main(String[] args) {
        printMessage(new JSOMMessageCreator());
        printMessage(new TextMessageCreator());
    }

    private static void printMessage(MessageCreator messageCreator) {
        Message message = messageCreator.getMessage();
        System.out.println(message);
    }

}
