package com.homework.first;

public class Seaweed extends Subject {

    private String taste;

    public Seaweed(String color, double cost, String taste) {
        super(color, cost);
        this.taste = taste;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

}
