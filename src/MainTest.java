import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    private Main main = new Main();

    @Test
    public void test_one_length(){
        String input ="a";
        assertEquals(1,main.getLongestLength(input));
    }

    @Test
    public void test_three_max(){
        String input ="aabbbc";
        assertEquals(3,main.getLongestLength(input));
    }

    @Test
    public void test_four_end(){
        String input ="aabbbcccc";
        assertEquals(4,main.getLongestLength(input));
    }

}
