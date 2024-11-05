package ru.mirea.practice.s23k0155;

import ru.mirea.practice.s23k0155.prac5.Point;

abstract class Shape {
    protected String colour;
    protected Point position;

    public Shape(String color, Point position) {
        this.colour = color;
        this.position = position;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public String getColor() {
        return colour;
    }

    public Point getPosition() {
        return position;
    }
}