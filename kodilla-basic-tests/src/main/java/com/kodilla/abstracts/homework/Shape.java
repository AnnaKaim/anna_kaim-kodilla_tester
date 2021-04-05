package com.kodilla.abstracts.homework;

public abstract class Shape {

    private int area;
    private int circumference;

    public Shape(int area, int circumference) {
        this.area = area;
        this.circumference = circumference;
    }

    public int getArea() {
        return area;
    }

    public int getCircumference() {
        return circumference;
    }

    public abstract void giveArea();

    public abstract void giveCircumference();
}
