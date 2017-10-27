package com.homework.first;

public abstract class Fish extends Inhabitant {

    private boolean sex;

    public Fish(String name, int age, boolean isAlive, String color, boolean sex) {
        super(name, age, isAlive, color);
        this.sex = sex;
    }

    public void swim() {
        //fish can swim
    }

    public void lookAtSomething() {
        //fish sometimes looks at something
    }

    public void dream() {
        //each fish dreams about something
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }
}
