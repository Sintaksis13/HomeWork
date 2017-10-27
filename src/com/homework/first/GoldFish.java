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
}
