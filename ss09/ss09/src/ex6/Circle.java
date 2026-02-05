package ex6;

public class Circle extends Shape {
    private double radius;
    private static final double PI = 3.1416;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double calculateArea() {
        return PI * radius * radius;
    }
}