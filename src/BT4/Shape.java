package BT4;

public class Shape {
    private double a = 1.0;
    private double b = 1.0;
    private double c = 1.0;

    public Shape() {
    }
    public Shape(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }
    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }
    public double getC() {
        return c;
    }
    public void setC(double c) {
        this.c = c;
    }
    public double getArea(){
        double p = getPerimeter();
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
    public double getPerimeter(){
        return a+b+c;
    }
    public void displayData() {
        System.out.println("Side a: "+a);
        System.out.println("Side a: "+b);
        System.out.println("Side a: "+c);
        System.out.println("Area: "+getArea());
        System.out.println("Perimeter: "+getPerimeter());
    }
}
