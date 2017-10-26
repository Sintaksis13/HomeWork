package com.homework.first;

public class GoldFish extends Fish {

    public GoldFish(String name, int age, boolean isAlive, String color, boolean sex) {
        super(name, age, isAlive, color, sex);
    }

    @Override
    public void lookAtSomething() {
        super.lookAtSomething();
        System.out.println("It looks at something really greatly!");
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public boolean isAlive() {
        return super.isAlive();
    }

    @Override
    public void setAlive(boolean alive) {
        super.setAlive(alive);
    }

    @Override
    public boolean isSex() {
        return super.isSex();
    }

    @Override
    public void setSex(boolean sex) {
        super.setSex(sex);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }
}
