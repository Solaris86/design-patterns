package com.udemy.designpatterns.creational.simplefactory;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString(callSuper = true)
public class BlogPost extends Post {

    private String author;
    private String[] tags;

}
