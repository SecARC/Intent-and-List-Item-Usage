package com.example.week06_lecture.Model;

import java.io.Serializable;

public class Drink implements Serializable {
    private String name;
    private String description;
    private int imageResourceID;

    public Drink(String name, String description, int imageResourceID) {
        this.name = name;
        this.description = description;
        this.imageResourceID = imageResourceID;
    }

    public Drink(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Drink(String name) {
        this.name = name;
        this.description = name;
    }

    public int getImageResourceID() {
        return imageResourceID;
    }

    public void setImageResourceID(int imageResourceID) {
        this.imageResourceID = imageResourceID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return getName();
    }
}
