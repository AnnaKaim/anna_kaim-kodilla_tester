package com.kodilla.collections.interfaces.homework;

public class Opel implements Car{

    private int acceleration;
    private int braking;
    int speed = 0;

    public Opel(int acceleration, int braking) {
        this.acceleration= acceleration;
        this.braking = braking;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        int faster = speed + acceleration;
        speed += acceleration;
        System.out.println(faster);
    }

    @Override
    public void decreaseSpeed() {
        int slower = speed - braking;
        speed -= braking;
        System.out.println(slower);
    }
}
