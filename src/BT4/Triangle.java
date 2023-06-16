package BT4;

public class Triangle extends Shape {
    private String color;

    public Triangle() {
    }
    public Triangle(double a, double b, double c, String color) {
        super(a, b, c);
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void displayData() {
        System.out.println("Side a: "+getA()); // kế thừa từ Shape
        System.out.println("Side a: "+getB()); // kế thừa từ Shape
        System.out.println("Side a: "+getC()); // kế thừa từ Shape
        System.out.println("Color: "+getColor());
        System.out.println("Perimeter: "+getPerimeter()); // kế thừa từ Shape
        System.out.println("Area: "+getArea()); // kế thừa từ Shape
    }
}
