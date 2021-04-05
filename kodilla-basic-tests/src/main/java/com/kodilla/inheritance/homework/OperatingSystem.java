package com.kodilla.inheritance.homework;

public class OperatingSystem {

    private int year;

    public OperatingSystem(int year) {
        this.year = year;
    }

    public void turnOn() {
        System.out.println("System turn ON");
    }

    public void turnOff() {
        System.out.println("System turn OFF");
    }

    public int getYear() {
        return year;
    }

    public void yearOfProduction() {
        System.out.println("The System was released in: " + year);
    }
}
//