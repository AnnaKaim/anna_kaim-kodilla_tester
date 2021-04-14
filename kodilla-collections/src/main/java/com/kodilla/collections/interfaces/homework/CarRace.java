package com.kodilla.collections.interfaces.homework;


public class CarRace {
    public static void main(String[] args) {

        Honda honda = new Honda(62,57);
        doRace(honda);

        Mercedes mercedes = new Mercedes(64, 60);
        doRace(mercedes);

        Opel opel = new Opel(59, 58);
        doRace(opel);
    }

    private static void doRace(Car car) {

        System.out.println("--------------------------");
        System.out.println("Increase speed");
        System.out.println("--------------------------");

        for (int i = 0; i < 3; i++) {
            car.getSpeed();
            car.increaseSpeed();
        }

        System.out.println("--------------------------");
        System.out.println("Decrease speed");
        System.out.println("--------------------------");

        for (int i = 0; i < 2; i++) {
            car.getSpeed();
            car.decreaseSpeed();
        }

        System.out.println("--------------------------");
        System.out.println("Get the final speed");
        System.out.println("--------------------------");
        System.out.println(car.getSpeed());
    }
}
