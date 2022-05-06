package shapes_abstract;

public class Circle extends Shape {
    private static double PI=3.14;

    private double radius;

    public Circle(String displayName, double radius){
        super(displayName);
        this.radius=radius;
    }

    @Override
    public double getArea() {
        return PI*radius*radius;
    }
}
