package com.udemy.designpatterns.creational.factory;

import com.udemy.designpatterns.creational.factory.message.Message;

public abstract class MessageCreator {

    public Message getMessage() {
        Message message = createMessage();
        message.addDefaultHeaders();
        message.encrypt();

        return message;
    }

    protected abstract Message createMessage();

}
