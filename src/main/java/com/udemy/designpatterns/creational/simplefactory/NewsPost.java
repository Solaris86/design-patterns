package com.udemy.designpatterns.creational.simplefactory;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Setter
@Getter
@ToString(callSuper = true)
public class NewsPost extends Post {

    private String headline;
    private LocalDate newsTime;

}
