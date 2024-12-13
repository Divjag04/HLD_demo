package com.example.demo.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Product extends baseModel{
    private String name;
    private String description;
    private String imageUrl;
    private Category category;
}
