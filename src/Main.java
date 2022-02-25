public class Main {public static void main(String[] args) {
    // write your code here
    System.out.println(removeCharacter("abcd",'c')); //abd
    swapWithoutBuffer(2,3);
    System.out.println(code("ab"));//fg
    numberOfVowelsAndConsonants("hello");
}
    //1. написать метод, убирающий заданную букву из строки
    public static String removeCharacter(String str, char ch){
        if(str==null)return "";
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=ch)
                sb.append(str.charAt(i));
        }
        return new String(sb); // sb.toString
    }


    //2.Код Цезаря  это простой метод, использовавшийся Цезарем для передачи
    // шифрованных сообщений своим генералам. Каждая буква заменяется на на другую,
    //находящуюся на N позиций вперед в английском(в нашем случае) алфавите. Например,
    //для сдвига N=5 буква с будет заменена на h. При достижении конца алфавита замена
    // происходит по кругу. т.е. z  будет заменено на е.
    // Напишите этот метод Цезаря

    public static String code(String code){
        String coded="";
        int lastCharValue = 'z';//122
        int alphabetLength= 'z'-'a'+1;// a=097

        System.out.println("alphabetLength="+alphabetLength);
        System.out.println("lastCharValue="+lastCharValue);

        for(char character: code.toCharArray()){
            int charNoRotation=character+5;
            int charValue= charNoRotation<lastCharValue?charNoRotation:charNoRotation-alphabetLength;


            coded +=(char) charValue;


        }
        return coded;
    }


    //3. Напишите метод для перестановки значений двух переменных без использования
    // третьей. public static void swapWithoutBuffer(int a, int b) -> на экран должно быть выведены новые
    // значения где а=b,b=a но заводить новые переменные в методе нельзя
    public static void swapWithoutBuffer(int a, int b){//a=2, b=3
        a=a+b; //2+3
        b=a-b; // 2+3-3=2
        a=a-b;//2+3-2=3

        System.out.println("a now is "+a+" , b now is "+b );
    }

    //4.Подсчитать и вывести на экран количество гласных и согласных букв в слове на английском языке,
    // состоящем из маленьких букв  public static void numberOfVowelsAndConsonants(String string)
    public static void numberOfVowelsAndConsonants(String string){
        int counterVowel=0;
        int counterConsonant=0;

        for(int i=0;i<string.length();i++){
            char character= string.charAt(i);
            if(Character.isLetter(character)){
                if(
                        character=='a'||
                                character=='u'||
                                character=='o'||
                                character=='e'||
                                character=='i'||
                                character=='y'
                ) counterVowel++;
                else counterConsonant++;
            }
        }
        System.out.println(counterVowel);
        System.out.println(counterConsonant);
    }



    //5. Развернуть порядок слов в строке. т.е. Hello World -> World Hello
    public String reverseWords(String string){
        String[] words = string.split(" ");
        StringBuilder res= new StringBuilder();

        for(int i=words.length-1;i>=0;i--){
            res.append(words[i]).append(" ");
        }
        return new String(res);
    }
}

//6* Есть массив целых чисел больше нуля. Вася и Петя задумывают по одному числу.
// Найти наибольшую длину подмассива этого массива, такого что этот подмассив содержит поровну любимого
// числа Васи и Пети. Если такого подмассива не существует, вернуть 0. Подмассив имеется в виду часть
// массива от нулевого элемента и дальше.
//например: (7, 42)->  {6,42,11,7,1,42}-> 5, (7,42)-> {7,42,11,7,1,42}-> 6

//7.Найти сумму всех значений n-го подмассива двумерного массива
// public static int sumOfNSubArray(int[][] ints, int n)

//8.вывести на экран все значения двумерного массива
// public ststic void print2Dim(int[][] array)

//9. Вывести на экран номер строки (подмассива) двумерного массива  сумма всех элементов которого равна нулю

//10. метод принимает двумерный массив и возвращает количество подмассивов(строк), в которых нет отрицательных
// элементов public static int method(int[][]array)
//11*  сложить числа в двумерном массиве только из тех подмассивов, где нету отрицательных элементов

//

