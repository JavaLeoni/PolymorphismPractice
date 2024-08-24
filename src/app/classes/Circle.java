package app.classes;

public class Circle implements app.interfaces.Shape {

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Коло з радіусом " + radius;
    }
}
