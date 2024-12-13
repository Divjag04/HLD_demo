package com.example.demo.models;

import lombok.Getter;
import lombok.Setter;

import javax.swing.plaf.nimbus.State;
import java.util.Date;

@Getter
@Setter
public class baseModel {
    private Long id;
    private Date createdAt;
    private Date updatedAt;
    private State state;
}
