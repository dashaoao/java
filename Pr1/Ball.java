package Pr1;

public class Ball {
    private String colour;
    private double radius;

    public Ball(){
        colour = "red";
        radius = 1.0;
    }
    public Ball(String c){
        colour = c;
        radius = 1.0;
    }
    public Ball(double r){
        colour = "red";
        radius = r;
    }
    public Ball(String c, double r){
        colour = c;
        radius = r;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    public String getColour(){
        return colour;
    }
    public double getRadius(){
        return radius;
    }

    public String toString(){
        return "Colour - " + this.colour + ", radius " + this.radius;
    }
}
