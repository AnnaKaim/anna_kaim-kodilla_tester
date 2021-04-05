package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {

        Shape rectangle = new Rectangle();

        ShapeProcessor processor = new ShapeProcessor();
        processor.process(rectangle);

        Shape square = new Square();

        ShapeProcessor processor1 = new ShapeProcessor();
        processor.process(square);

        Shape triangle = new Triangle();

        ShapeProcessor processor2 = new ShapeProcessor();
        processor.process(triangle);
    }
}
