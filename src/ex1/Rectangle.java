package ex1;

public class Rectangle {
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public Rectangle() {
        this.height = 1;
        this.width = 3;
    }

    public double getPerimeter(double height, double width) {
        return 2 * (height + width);
    }

    public double getArea(double height, double width) {
        return height * width;
    }
}
