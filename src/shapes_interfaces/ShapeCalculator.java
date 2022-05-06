package shapes_interfaces;

public class ShapeCalculator {

    public double totalArea(Shape[] shapes){
        double res =0;
        for(Shape s: shapes){
            res+= s.area();
        }
        return res;
    }
}
