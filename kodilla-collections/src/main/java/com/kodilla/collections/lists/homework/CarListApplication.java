package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Honda;
import com.kodilla.collections.interfaces.homework.Mercedes;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.ArrayList;
import java.util.List;

public class CarListApplication {
    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();
        Opel opel = new Opel(30, 28);
        cars.add(opel);
        cars.add(new Honda(37, 35));
        cars.add(new Mercedes(34, 34));

        cars.remove(1);
        cars.remove(opel);

        System.out.println(cars.size());
        for (Car car : cars) {
            CarUtils.describeCar(car);
        }
    }
}
