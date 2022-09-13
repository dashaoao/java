package Pr3.Part2;

public class TestMovable {
    public static void main(String[] args) {
        MovablePoint mP = new MovablePoint(0, 0, 3, 3);
        mP.moveLeft();
        mP.moveUp();
        mP.moveUp();
        System.out.println(mP);

        MovableCircle mC = new MovableCircle(4, -5, 5, 1, 5);
        mC.moveDown();
        mC.moveLeft();
        System.out.println(mC);

        MovableRectangle mR = new MovableRectangle(1, 2, 5, -2, 2, 3);
        System.out.println(mR.isEqual());
        mR.moveRight();
        mR.moveDown();
        System.out.println(mR);
    }
}
