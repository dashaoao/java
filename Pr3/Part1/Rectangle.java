package Pr3.Part1;

import Pr3.Part1.Shape;

public class Rectangle extends Shape {

    protected double width;
    protected double length;

    public Rectangle() {
        filled = false;
        color = "blue";
        width = 1;
        length = 2;
    }

    public Rectangle(double width, double length) {
        filled = false;
        color = "blue";
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    @Override
    public double getArea(){
        return width * length;
    }

    @Override
    public double getPerimeter(){
        return 2 * width + 2 * length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString(){
        return "Shape: rectangle - width: " + this.width + ", length: " + this.length + ", color: " + this.color;
    }
}
