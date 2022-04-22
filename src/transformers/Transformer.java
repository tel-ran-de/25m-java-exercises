package transformers;

public class Transformer {
    public static void main(String[] args) {
        transform("aaa BBBB dEF",new WordsTransformerLowerCase());
        transform("aaa BBBB dEF",new WordsTransformerUpperCase());
        transform("aaa BBBB dEFrt",new WordsTransformerStar());
    }


    public static String transform(String string, WordsTransformer transformer){
//TODO write method
    }
}
