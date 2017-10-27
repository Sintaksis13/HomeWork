package com.homework.first;

public class Rock extends Subject {

    private double weight;

    public Rock(String color, double cost, double weight) {
        super(color, cost);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

}
