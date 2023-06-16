package BT4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // a/b/c/color do người dùng nhập vào
        System.out.println("Input a: ");
        double a = new Scanner(System.in).nextDouble();
        System.out.println("Input b: ");
        double b = new Scanner(System.in).nextDouble();
        System.out.println("Input c: ");
        double c = new Scanner(System.in).nextDouble();
        System.out.println("Input color: ");
        String color = new Scanner(System.in).nextLine();
        Triangle triangle = new Triangle(a,b,c,color); // constructor 4 tham số
        System.out.println("=======a/b/c/color do người dùng nhập vào======");
        triangle.displayData();
        // a/b/c kế thừa từ Shape father vs fixed color
        Triangle triangle1 = new Triangle();
        double aa =  triangle1.getA(); // mặc định 1.0 trong Shape
        double bb = triangle1.getB(); // mặc định 1.0 trong Shape
        double cc = triangle1.getC(); // mặc định 1.0 trong Shape
        triangle1 = new Triangle(aa,bb,cc,"yellow");
        System.out.println("a/b/c kế thừa từ Shape father vs fixed color");
        triangle1.displayData();
    }
}
