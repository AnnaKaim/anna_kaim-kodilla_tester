package com.kodilla.inheritance.homework;

public class Linux extends OperatingSystem {

    public Linux(int year) {
        super(year);
        System.out.println("Linux constructor");
    }

    @Override
    public void turnOn() {
        System.out.println("System Linux turn ON");
    }

    @Override
    public void turnOff() {
        System.out.println("System Linux turn OFF");
    }
}
