package com.udemy.designpatterns.creational.abstractfactory2;

import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class Client {

    public static void main(String[] args) throws ParserConfigurationException {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        System.out.println("Using factory class: " + documentBuilderFactory);

        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        System.out.println("Got builder class: " + documentBuilder);

        Document document = documentBuilder.newDocument();
        System.out.println("Got document class: " + document);
    }

}
