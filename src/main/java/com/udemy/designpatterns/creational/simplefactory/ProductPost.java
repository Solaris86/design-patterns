package com.udemy.designpatterns.creational.simplefactory;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString(callSuper = true)
public class ProductPost extends Post {

    private String imageUrl;
    private String name;

}
