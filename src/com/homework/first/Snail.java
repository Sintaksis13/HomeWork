package com.homework.first;

public class Snail extends Inhabitant{

    private boolean soul;

    public Snail(String name, int age, boolean isAlive, String color, boolean soul) {
        super(name, age, isAlive, color);
        this.soul = soul;
    }

    public void cleanWalls(){

    }

    @Override
    public void eatFood() {
        super.eatFood();
        System.out.println("Its eating very strange, eww");
    }

    public boolean isSoul() {
        return soul;
    }

    public void setSoul(boolean soul) {
        this.soul = soul;
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
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }
}
