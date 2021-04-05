package com.kodilla.abstracts.homework;

public class Triangle extends Shape{

    public Triangle(int area, int circumference) {
        super(area, circumference);
    }

    public Triangle() {
        super(60, 40);
    }

    @Override
    public void giveArea() {
        System.out.println("Triangle area is equals to " + getArea() ); }

    @Override
    public void giveCircumference() {
        System.out.println("Triangle circumference is equals to " + getCircumference() ); }

}
