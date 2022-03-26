package shapes;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle("Circle", 10);
        Rectangle rectangle = new Rectangle("Rectangle", 5, 10);
        Square square = new Square("Square", 7);

        Shape circle1 = new Circle("Circle1", 13);
        Shape rectangle1 = new Rectangle("Rectangle1", 15, 34);
        Shape square1 = new Square("Square1", 23);

     //   Shape shape = new Shape("Shape");

        Shape[]shapes={circle,circle1,rectangle,rectangle1,square,square1};

        System.out.println("shapes: ");
        for(Shape s: shapes){
            System.out.println(s.getDisplayName()+" has area of "+s.getArea());
        }
    }



}
