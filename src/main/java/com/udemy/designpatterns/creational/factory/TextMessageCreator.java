package com.udemy.designpatterns.creational.factory;

import com.udemy.designpatterns.creational.factory.message.Message;
import com.udemy.designpatterns.creational.factory.message.TextMessage;

public class TextMessageCreator extends MessageCreator {
    @Override
    public Message createMessage() {
        return new TextMessage();
    }
}
