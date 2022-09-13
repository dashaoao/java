package Pr3.Part2;

public class MovableCircle implements Movable {

    private int radius;

    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    public String toString() {
        return "Circle - x = " + center.x + ", y = " + center.y + "; radius = " + radius;
    }

    @Override
    public void moveUp() {
        center.y += 1 * center.ySpeed;
    }

    @Override
    public void moveDown() {
        center.y -= 1 * center.ySpeed;
    }

    @Override
    public void moveLeft() {
        center.x -= 1 * center.xSpeed;
    }

    @Override
    public void moveRight() {
        center.x += 1 * center.xSpeed;
    }

}
