package com.kodilla.basic_assertion;

public class Application {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;

        int sumResult = calculator.sum(a, b);
        boolean correct = ResultChecker.assertEquals(13, sumResult);
        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }


        Calculator calculator1 = new Calculator();
        a = 3;
        b = 7;

        int subtractResult = calculator1.subtract(a, b);
        boolean correct1 = ResultChecker.assertEquals(-4, subtractResult);
        if (correct1) {
            System.out.println("Metoda subtract działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda subtract nie działa poprawnie dla liczb " + a + " i " + b);
        }


        Calculator calculator2 = new Calculator();
        a = 4;

        int squaredResult = calculator2.squared(a);
        boolean correct2 = ResultChecker.assertEquals(16, squaredResult);
        if (correct2) {
            System.out.println("Metoda squared działa poprawnie dla liczby " + a);
        } else {
            System.out.println("Metoda squared nie działa poprawnie dla liczby " + a);
        }
    }
}
