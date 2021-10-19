package com.udemy.designpatterns.creational.simplefactory;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Setter
@Getter
@ToString
public abstract class Post {

    private Long id;
    private String title;
    private String content;
    private LocalDate createdOn;
    private LocalDate publishedOn;

}
