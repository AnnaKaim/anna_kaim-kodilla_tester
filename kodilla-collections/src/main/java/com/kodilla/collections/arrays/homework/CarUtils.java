package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Honda;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Mercedes;


public class CarUtils {

    public static void describeCar(Car car) {
        System.out.println("-----------------------------");
        System.out.println("Car: " + getCarName(car));
        System.out.println("Increase speed: ");
        car.increaseSpeed();
        System.out.println("Decrease speed : ");
        car.decreaseSpeed();
        System.out.println("Car speed: " + car.getSpeed());
    }

    private static String getCarName(Car car) {
        if (car instanceof Honda)
            return "Honda";
        else if (car instanceof Mercedes)
            return "Mercedes";
        else if (car instanceof Opel)
            return "Opel";
        else
            return "Unknown Car name";
    }
}