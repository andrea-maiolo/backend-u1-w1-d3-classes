package ex1;

public class Rectangle {
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public Rectangle() {
        this.height = 1.5;
        this.width = 3.5;
    }

    public static void printTwoRectangles(Rectangle r1, Rectangle r2) {
        double p1 = r1.getPerimeter(r1.height, r1.width);
        double p2 = r2.getPerimeter(r2.height, r2.width);
        double a1 = r1.getArea(r1.height, r1.width);
        double a2 = r2.getArea(r2.height, r2.width);
        double ps = p1 + p2;
        double as = a1 + a2;
        System.out.println(p1 + " perimeter rectangle 1");
        System.out.println("Area rectangle 1 " + a1);
        System.out.println(p2 + " perimeter rectangle 2");
        System.out.println("Area rectangle 2" + a2);
        System.out.println(ps + " perimeters summed");
        System.out.println("Areas summed " + as);
    }

    public double getPerimeter(double height, double width) {
        return 2 * (height + width);
    }

    public double getArea(double height, double width) {
        return height * width;
    }

    public void printRectangle() {
        double p = getPerimeter(this.height, this.width);
        double a = getArea(this.height, this.width);
        System.out.println(p + " perimeter rectangle");
        System.out.println("Area rectangle " + a);
    }
}
