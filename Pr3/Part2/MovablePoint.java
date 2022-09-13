package Pr3.Part2;

public class MovablePoint implements Movable {

    int x;
    int y;

    int xSpeed;

    int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public String toString() {
        return "Point - x = " + x + ", y = " + y;
    }

    @Override
    public void moveUp() {
        y += 1 * ySpeed;
    }

    @Override
    public void moveDown() {
        y -= 1 * ySpeed;
    }

    @Override
    public void moveLeft() {
        x -= 1 * xSpeed;
    }

    @Override
    public void moveRight() {
        x += 1 * xSpeed;
    }
}
