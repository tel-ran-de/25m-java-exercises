package transformers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TransformerTest {

    private Transformer transformer =new Transformer();
    String input ="aaa BBBB dEFrt";
    @Test
    public void test_transform_zero_length(){
        String zero="";
        assertEquals(zero,transformer.transform(zero,new WordsTransformerLowerCase()));
        assertEquals(zero,transformer.transform(zero,new WordsTransformerUpperCase()));
        assertEquals(zero,transformer.transform(zero,new WordsTransformerStar()));
    }

    @Test
    public void test_transform_lower_case(){
        String expected="aaa bbbb dEFrt";
        assertEquals(expected,transformer.transform(input,new WordsTransformerLowerCase()));
    }
    @Test
    public void test_transform_upper_case(){
        String expected="AAA BBBB dEFrt";
        assertEquals(expected,transformer.transform(input,new WordsTransformerUpperCase()));
    }
    @Test
    public void test_transform_star(){
        String expected="aaa BBBB *****";
        assertEquals(expected,transformer.transform(input,new WordsTransformerStar()));
    }
    @Test
    public void test_transform_no_change(){
        String expected="aaa BBBBB dEFrg";
        assertEquals(expected,transformer.transform(expected,new WordsTransformerLowerCase()));
    }



}
