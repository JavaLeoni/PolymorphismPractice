package app.classes;

public class Triangle implements app.interfaces.Shape {
    double base;
    double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (base * height) / 2;
    }

    @Override
    public String toString() {
        return "Трикутник з основою і висотою: " + base + "x" + height;
    }
}
