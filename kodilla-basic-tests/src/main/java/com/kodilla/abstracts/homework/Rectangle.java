package com.kodilla.abstracts.homework;

public class Rectangle extends Shape{

    public Rectangle(int area, int circumference) {
        super(area, circumference);
    }

    public Rectangle() {
        super(15, 16);
    }

    @Override
    public void giveArea() {
        System.out.println("Rectangle area is equals to: " + getArea() ); }

    @Override
    public void giveCircumference() {
        System.out.println("Rectangle circumference is equals to: " + getCircumference() ); }

}
