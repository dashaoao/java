package Pr3.Part1;

public class Square extends Rectangle {

    public Square() {
        width = 1;
        length = 1;
        filled = false;
        color = "blue";
    }

    public Square(double side){
        width = side;
        length = side;
        filled = false;
        color = "blue";
    }

    public Square(double side, String color, boolean filled) {
        width = side;
        length = side;
        this.filled = filled;
        this.color = color;
    }

    public double getSide(){
        return length;
    }

    public void setSide(double side){
        length = side;
        width = side;
    }

    @Override
    public void setWidth(double side){
        width = side;
    }

    @Override
    public void setLength(double side){
        length = side;
    }

    @Override
    public String toString(){
        return "Shape: square - side: " + this.length + ", color: " + this.color;
    }
}
