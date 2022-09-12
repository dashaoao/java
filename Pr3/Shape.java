package Pr3;

import java.lang.Math;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape() {
        this.filled = false;
        this.color = "blue";
    };
    public Shape(String color, boolean filled){
        this.filled = filled;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public boolean isFilled() {
        return filled;
    }

    abstract double getArea();
    abstract double getPerimeter();

    public String toString(){
        return "Color - " + color + ", filled - " + filled;
    }
}