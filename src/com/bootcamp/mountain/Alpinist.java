package com.bootcamp.mountain;

public class Alpinist extends Mountaineer {
    private int score;

    public Alpinist() {}

    public Alpinist(int score) {
        this.score = score;
    }

    public Alpinist(int id, String name, String lastName, int score, double membership) {
        super(id, name, lastName);
        this.score = score;
        this.membership = membership;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public double getMembership() {
        return membership;
    }

    @Override
    public void print() {
        System.out.println("Alpinist " + this.getName() + " " + this.getLastName() + " is ascending...");
    }

    @Override
    public double printMembership() {
        return this.getMembership();
    }

    @Override
    public void successfulClimb(Mountain mountain) {}

    @Override
    public void alpinistScore() {
        double totalMembershipCost = this.getMembership();
        for(int i = 0; i < this.getScore(); i++) {
            totalMembershipCost -= 50;
        }
        System.out.println("Alpinist " + this.getName() + " " + this.getLastName() + " membership cost is: " + totalMembershipCost);
    }
}
