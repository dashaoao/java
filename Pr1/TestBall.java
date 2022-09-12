package Pr1;

import Pr1.Ball;

public class TestBall {
    public static void main(String[] args) {
        Ball first = new Ball();
        Ball second = new Ball(20.0);
        Ball third = new Ball("orange", 25.5 );
        first.setColour("green");
        System.out.println("first: " + first);
        System.out.println("second: " + second);
        System.out.println("third: " + third);
    }
}
