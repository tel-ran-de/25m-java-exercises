public class Main {
    public static void main(String[] args) {
        //  1**.есть массив интов .написать метод который возвращает true если в массиве существуют
        // два таких числа произведение которых равно заданному числу
        // {3,5,7,23,67}, 21 -> true
        //{3,5,7,23,67}, 23 -> false

        //2** "aabbbbccd"->"2a4b2cd"

        System.out.println(firstToEnd("abcd"));//bcda
        System.out.println(lastToBegin("abcd"));//abcd->dabc
        System.out.println(isCycle("abc","acb"));
        System.out.println(isCycle2("abc","acb"));




    }
    /*переставить первую букву в конец строки (abcd -> bcda) (использовать метод substring класса String)
переставить последнюю букву в начало строки (abcd-> dabc). (использовать метод substring класса String)
3*. Даны две строки написать метод, проверяющий образована ли вторая строка сдвигом букв первой строки (abc->cab->bca)
public static boolean isCycle(String str1, String str2) */

    //переставить первую букву в конец строки (abcd -> bcda) (использовать метод substring класса String)
    public static String firstToEnd(String str){
        String str1 = str.substring(1);
        String str2 = str.substring(0,1);

        return str1+str2;
    }

    //переставить последнюю букву в начало строки (abcd-> dabc). (использовать метод substring класса String)
    public static String lastToBegin(String str){
        String str1 = str.substring(str.length()-1);
        String str2 = str.substring(0,str.length()-1);
        String str3=str1+str2;

        return str3;

    }
    //3*. Даны две строки написать метод, проверяющий образована ли вторая строка сдвигом букв
    // первой строки (abc->cab->bca)
    //public static boolean isCycle(String str1, String str2)     abc cab-bca-abc
    public static boolean isCycle(String str1, String str2){ //str1=abc, str2=cab
        if (str1.length()!=str2.length())
            return false;
        int length= str2.length();
        if(length==0)return true;

        for(int i=0;i<length;i++){
            if(str1.equals(shifted(str2,i))){
                return true;
            }
        }
        return false;
    }

    public static String shifted(String str2, int shift) {
        return str2.substring(shift)+str2.substring(0,shift);// cab  ab+c
    }

    public static boolean isCycle2(String str1, String str2){
        String str =str1.concat(str1); // abc+abc = abcabc

        return str.contains(str2);
        //abc->cab->bca
        // abcabc
    }


}
