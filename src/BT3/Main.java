package BT3;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(1,2);
        MoveablePoint moveablePoint = new MoveablePoint(point.getX(), point.getY(),3,4);
        System.out.println(point);
        System.out.println(moveablePoint);
        System.out.println(moveablePoint.move());;
    }
}
