package com.bootcamp.mountain;

public class RecreationalMountaineer extends Mountaineer{

    private int weightOfEquipment;
    private String districtName;
    private double maxAscent;

    public RecreationalMountaineer() {}

    public RecreationalMountaineer(int weightOfEquipment, String districtName, double maxAscent, double membership) {
        this.weightOfEquipment = weightOfEquipment;
        this.districtName = districtName;
        this.maxAscent = maxAscent;
        this.membership = membership;
    }

    public RecreationalMountaineer(int id, String name, String lastName, int weightOfEquipment, String districtName, double maxAscent, double membership) {
        super(id, name, lastName);
        this.weightOfEquipment = weightOfEquipment;
        this.districtName = districtName;
        this.maxAscent = maxAscent;
        this.membership = membership;
    }

    public int getWeightOfEquipment() {
        return weightOfEquipment;
    }

    public void setWeightOfEquipment(int weightOfEquipment) {
        this.weightOfEquipment = weightOfEquipment;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public double getMaxAscent() {
        return maxAscent;
    }

    public void setMaxAscent(double maxAscent) {
        this.maxAscent = maxAscent;
    }

    public double getMembership() {
        return membership;
    }

    @Override
    public void print() {
        System.out.println("Mountaineer " + this.getName() + " " + this.getLastName() + " is ascending...");
    }

    @Override
    public double printMembership() {
        return this.getMembership();
    }

    @Override
    public void successfulClimb(Mountain mountain) {
        double ascent = this.getMaxAscent();
        for(int i = 0; i < this.getWeightOfEquipment(); i++) {
            ascent -= 50;
        }
        if(ascent >= mountain.getHeight()) {
            System.out.println("The ascent is successful.");
        }
        else {
            System.out.println("The ascent is unsuccessful.");
        }
    }

    @Override
    public void alpinistScore() {}
}
