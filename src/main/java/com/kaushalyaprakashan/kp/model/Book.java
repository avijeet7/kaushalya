package com.kaushalyaprakashan.kp.model;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Book {

    @Id
    @GeneratedValue
    private long id;

    private String title;
    private String description;
    private String author;
    private double price;
    private String category;
    private String isbn;

}
