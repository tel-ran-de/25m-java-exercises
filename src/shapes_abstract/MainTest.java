package shapes_abstract;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MainTest {

    Shape circle = new Circle("Circle", 10);
    Shape rectangle=new Rectangle("Rectangle",5,10);
    Shape square = new Square("Square", 7);

    Shape[] shapes ={circle,rectangle,square};

    @Test
    public void test_sorted(){
        Shape[] actual ={circle,rectangle,square};
        Shape[] expected ={square,rectangle,circle};
        Arrays.sort(actual);

        assertArrayEquals(expected,actual);

    }

    @Test
    public void test_sorted_one(){
        Shape[] actual ={circle};
        Shape[] expected ={circle};
        Arrays.sort(actual);

        assertArrayEquals(expected,actual);

    }

}
