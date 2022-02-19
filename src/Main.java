import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 2**. на входе "aabbbbccd" ->" на выходе 2a4b2cd"
        System.out.println(numberCharacter("aabbbbccd"));
        System.out.println(numberCharacter("aabbbbccd"));
        //
        //3**. на входе "2a4b2cd"-> на выходе "aabbbbccd"
        //
        //кто еще не делал задача на анграммы: написать метод,
        // определяющий является ли одно слово анаграммой другого.
        // public boolean isAnagram ( String string1, String string2) . Т.е.
        // метод принимает две строки и возвращает true если второе слово является анаграммой первого и false если нет
    }

    //   2**. на входе "aabbbbccd" ->" на выходе 2a4b2cd"
    public static String numberCharacter(String str) {
        if (str.length() == 0)
            return "";

        int counter = 1;
        StringBuilder sb = new StringBuilder();


        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i - 1) != str.charAt(i)) {
                if (counter > 1) {
                    sb.append(counter).append(str.charAt(i - 1));//2a str =str + counter+str.charAt(i-1)
                    counter = 1;
                } else {
                    sb.append(str.charAt(i - 1));
                }
            } else {
                counter++;
            }
        }
        if (counter == 1)
            sb.append(str.charAt(str.length() - 1));
        else
            sb.append(counter).append(str.charAt(str.length() - 1));

        return sb.toString();
    }

    //3**. на входе "223a4b2cd"-> на выходе "aabbbbccd".substring(1,4)
    public static String onlyLetters(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            int digitsCounter = 0;
            while (Character.isDigit(str.charAt(i + digitsCounter))) {
                digitsCounter++;//3
            }
            if (digitsCounter > 0) {
                int number = Integer.parseInt(str.substring(i, i + digitsCounter));
                i += digitsCounter;

                for (int j = 0; j < number; j++) {
                    sb.append(str.charAt(i));
                }

            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    // public boolean isAnagram ( String string1, String string2) . Т.е.
    // метод принимает две строки и возвращает true если второе слово является анаграммой первого и false если нет
    public static boolean isAnagram(String str1, String str2) {
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

        if (str1.length() != str2.length())
            return false;

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        for (int i = 0; i < chars1.length; i++) {
            if (chars1[i] != chars2[i])
                return false;

        } return true;
    }
}
