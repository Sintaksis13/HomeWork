package com.homework.first;

public final class Aquarium {

    private double length;
    private double width;
    private double height;

    Aquarium(double length, double width, double height){

        this.length = length;
        this.width = width;
        this.height = height;

    }

    private Fish goldFishOne;
    private Fish goldFishTwo;
    private Rock rockOne;
    private Rock rockTwo;
    private Rock rockThree;
    private Inhabitant snail;
    private Subject seaweed;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

/*    public static void main(String[] args) {
        GoldFish fish = new GoldFish("Stew", 134, true, "blue", true);
    }*/

}
