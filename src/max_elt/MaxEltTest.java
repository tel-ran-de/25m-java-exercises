package max_elt;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxEltTest {

    private MaxElt maxElt = new MaxElt();

    @Test
    public void zero_elt_test(){
        int[] ints ={};
        assertEquals(-1,maxElt.max(ints));
    }
    @Test
    public void one_elt_test(){
        int[] ints ={2};
        assertEquals(2,maxElt.max(ints));
    }

    @Test
    public void two_elts_test(){
        int[] ints ={2,2};
        assertEquals(2,maxElt.max(ints));
    }

    @Test
    public void max_middle_test(){
        int[] ints ={2,2,7,1,9,0,8,6};
        assertEquals(9,maxElt.max(ints));
    }

    @Test
    public void max_first_test(){
        int[] ints ={10,2,2,7,1,9,0,8,6};
        assertEquals(10,maxElt.max(ints));
    }

    @Test
    public void max_last_test(){
        int[] ints ={2,2,7,1,9,0,8,6,10};
        assertEquals(10,maxElt.max(ints));
    }


}
