package transformers;

public class Transformer {
    public static void main(String[] args) {
     /*   System.out.println(transform("aaa BBBB dEF",new WordsTransformerLowerCase()));//bbbb
        System.out.println(transform("aaa BBBB dEF",new WordsTransformerUpperCase()));//AAA BBBB DEF
        System.out.println(transform("aaa BBBB dEFrt",new WordsTransformerStar()));//aaa BBB ******/
    }


    public  String transform(String string, WordsTransformer transformer){
        String[]words =string.split(" ");
        for(int i=0;i<words.length;i++){
            if(transformer.check(words[i])){
                words[i]=transformer.transform(words[i]);
            }
        }
        return String.join(" ",words);
    }
}
