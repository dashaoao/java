package Pr3.Part2;

public class MovableRectangle implements Movable{

    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    public boolean isEqual(){
        if(topLeft.xSpeed == bottomRight.xSpeed && topLeft.ySpeed == bottomRight.ySpeed){
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return "Rectangle: topLeft - (x = " + topLeft.x + ", y = " + topLeft.y +
                "); bottomRight - (x = " + bottomRight.x + ", y = " + bottomRight.y + ")";
    }

    @Override
    public void moveUp() {
        topLeft.y += 1 * topLeft.ySpeed;
        bottomRight.y += 1 * bottomRight.ySpeed;
    }

    @Override
    public void moveDown() {
        topLeft.y -= 1 * topLeft.ySpeed;
        bottomRight.y -= 1 * bottomRight.ySpeed;
    }

    @Override
    public void moveLeft() {
        topLeft.x -= 1 * topLeft.xSpeed;
        bottomRight.x -= 1 * bottomRight.xSpeed;
    }

    @Override
    public void moveRight() {
        topLeft.x += 1 * topLeft.xSpeed;
        bottomRight.x += 1 * bottomRight.xSpeed;
    }
}
