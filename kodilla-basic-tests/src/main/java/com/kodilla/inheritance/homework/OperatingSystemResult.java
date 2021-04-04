package com.kodilla.inheritance.homework;

public class OperatingSystemResult {

    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(2000);
        operatingSystem.turnOn();

        Windows windows = new Windows(2010);
        windows.turnOn();
        windows.yearOfProduction();

        Linux linux = new Linux(2015);
        linux.turnOn();
        linux.yearOfProduction();
    }
}
