package transformer_interface;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TransformerTest {

    private Transformer transformer =new Transformer();
    String input ="aaa BB ";
    @Test
    public void test_transform_zero_length(){
        String zero="";
        assertEquals(zero,transformer.transform(zero,new ToLowerCaseChecker()));
        assertEquals(zero,transformer.transform(zero,new ToUpperCaseChecker()));

    }

    @Test
    public void test_transform_lower_case(){
        String expected="aaa bb";
        assertEquals(expected,transformer.transform(input,new ToLowerCaseChecker()));
    }
    @Test
    public void test_transform_upper_case(){
        String expected="AAA BB";
        assertEquals(expected,transformer.transform(input,new ToUpperCaseChecker()));
    }

    @Test
    public void test_transform_no_change(){
        String expected="aaaaa BBBBB dEFrg";
        assertEquals(expected,transformer.transform(expected,new ToUpperCaseChecker()));
    }



}
