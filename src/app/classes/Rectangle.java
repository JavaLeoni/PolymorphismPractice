package app.classes;

public class Rectangle  implements app.interfaces.Shape {

    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Прямокутник з сторонами: " + width + "x" + height;
    }
}
