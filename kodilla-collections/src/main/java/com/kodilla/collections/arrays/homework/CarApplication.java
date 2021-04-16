package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Honda;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Mercedes;

import java.util.Random;

import static com.kodilla.collections.arrays.homework.CarUtils.describeCar;


public class CarApplication {

    public static void main(String[] args) {

        Random random = new Random();
        Car[] cars = new Car[random.nextInt(16)];

        for (int n = 0; n < cars.length; n++)
            cars[n] = drawCar();
        for (Car car : cars)
            CarUtils.describeCar(car);
    }

    private static Car drawCar() {

        Random random = new Random();

        int drawnCarBrand = random.nextInt(2);
        int a = random.nextInt() * 180 + 1;
        int b = random.nextInt() * 180 + 1;

        if (drawnCarBrand == 0)
            return new Honda(a, b);
        else if (drawnCarBrand == 1)
            return new Mercedes(a, b);
        else
            return new Opel(a, b);
    }
}
