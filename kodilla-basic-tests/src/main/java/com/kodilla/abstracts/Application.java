package com.kodilla.abstracts;

public class Application {

    public static void main(String[] args) {

        Animal dog = new Dog();

        AnimalProcessor processor = new AnimalProcessor();
        processor.process(dog);

        Animal duck = new Duck();

        AnimalProcessor processor1 = new AnimalProcessor();
        processor.process(duck);
    }
}
