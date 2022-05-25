package com.bootcamp.mountain;

public abstract class Mountaineer {

    private int id;
    private String name;
    private String lastName;

    public double membership;

    public Mountaineer() {};

    public Mountaineer(int id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getMembership() {
        return membership;
    }

    public void setMembership(double membership) {
        this.membership = membership;
    }

    public abstract void print();

    public abstract double printMembership();

    public abstract void successfulClimb(Mountain mountain);

    public abstract void alpinistScore();
}

