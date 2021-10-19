package com.udemy.designpatterns.creational.factory;

import com.udemy.designpatterns.creational.factory.message.JSONMessage;
import com.udemy.designpatterns.creational.factory.message.Message;

public class JSOMMessageCreator extends MessageCreator {
    @Override
    public Message createMessage() {
        return new JSONMessage();
    }
}
