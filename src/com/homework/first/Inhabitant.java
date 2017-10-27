package com.homework.first;

public abstract class Inhabitant {

    private String name;
    private int age;
    private boolean isAlive;
    private String color;

    public Inhabitant(String name, int age, boolean isAlive, String color) {
        this.name = name;
        this.age = age;
        this.isAlive = isAlive;
        this.color = color;
    }

    public void breatheUnderwater(){
        //inhabitant should breathe underwater to live there
    }

    public void eatFood(){
        //inhabitant should eat to live by the way
    }

    public void sleep(){
        //inhabitant should also sleep
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
