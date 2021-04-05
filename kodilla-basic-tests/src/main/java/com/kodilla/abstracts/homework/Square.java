package com.kodilla.abstracts.homework;

public class Square extends Shape{

    public Square(int area, int circumference) {
        super(area, circumference);
    }

    public Square() {
        super(25, 20);
    }

    @Override
    public void giveArea() {
        System.out.println("Square area is equals to " + getArea() ); }

    @Override
    public void giveCircumference() {
        System.out.println("Square circumference is equals to " + getCircumference() ); }
}
