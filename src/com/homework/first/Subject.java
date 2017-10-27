package com.homework.first;

public abstract class Subject {

    private String color;
    private double cost;

    public Subject(String color, double cost) {
        this.color = color;
        this.cost = cost;
    }

    public void dontMove(){
        //it cant move
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
