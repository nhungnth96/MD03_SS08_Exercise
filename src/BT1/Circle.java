package BT1;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return radius*2*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle: " +
                " | Radius: "+radius+
                " | Color: "+color+
                " | Area: "+getArea();
    }
}
