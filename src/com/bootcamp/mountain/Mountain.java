package com.bootcamp.mountain;

public class Mountain {
    private String name;
    private String country;
    private double height;

    public Mountain() {}

    public Mountain(String name, String country, double height) {
        this.name = name;
        this.country = country;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

}
