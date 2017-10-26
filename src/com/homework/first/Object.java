package com.homework.first;

public abstract class Object {

    private String color;
    private double cost;

    public Object(String color, double cost) {
        this.color = color;
        this.cost = cost;
    }

    public void dontMove(){

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
