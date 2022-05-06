package shapes_interfaces;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeCalculatorTest {
    private ShapeCalculator shapeCalculator = new ShapeCalculator();

    @Test
    public void test_two_shapes(){
        Shape[] shapes = {new Circle(10), new Rectangle(5,10)};
        assertEquals(364,shapeCalculator.totalArea(shapes));
    }

    @Test
    public void test_one_shape(){
        Shape[] shapes = {new Rectangle(5,10)};
        assertEquals(50,shapeCalculator.totalArea(shapes));
        assertTrue(shapeCalculator.totalArea(shapes)>0);
        assertFalse(shapeCalculator.totalArea(shapes)<0);
    }

    @Test
    public void test_zero_shapes(){
        Shape[] shapes = {};
        assertEquals(0,shapeCalculator.totalArea(shapes));
    }

}
