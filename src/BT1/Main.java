package BT1;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(2,"green");
        Cylinder cylinder = new Cylinder(circle.getRadius(), circle.getColor(), 3);
        System.out.println(circle);;
        System.out.println(cylinder);
    }
}
