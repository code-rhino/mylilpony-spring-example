package com.codedifferently.app.pony.model;

import javax.persistence.*;

@Entity
public class MyLittlePony {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    //@JsonIgnore
    private String color;

    public MyLittlePony(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public MyLittlePony(){
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
