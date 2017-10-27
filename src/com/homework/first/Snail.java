package com.homework.first;

public class Snail extends Inhabitant{

    private boolean soul;

    public Snail(String name, int age, boolean isAlive, String color, boolean soul) {
        super(name, age, isAlive, color);
        this.soul = soul;
    }

    public void cleanWalls(){
        //snails can clean aquarium's walls
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

}
