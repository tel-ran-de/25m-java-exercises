import java.util.Scanner;

public class GameGuessNumber {
    //написать игру Угадай число, в которой за ограниченное число попыток
    //        ввода числа с клавиатуры нужно угадать секретное число от 0 до 9.
    //     * Условия:
    //     * -Код игры должен находиться в классе GameGuessNumber
    //     * -Класс GameGuessNumber должен содержать две статические переменные
    //     scanner для ввода чисел с клавиатуры и secret, в которой записано секретное число
    //     * -Класс GameGuessNumber должен содержать следующие методы (могут быть и другие по
    //     * желанию): int readNumberOfAttempts()-считывает количество предоставляемых попыток
    //     *           int readNumber() - считывает вводимое число
    //     *           void guessNumber(int attempts) содержит логику игры

    private static Scanner scanner= new Scanner(System.in);
    private static int secret=9;

    public void start(){
        int attempts =readNumberOfAttempts();
        guessNumber(attempts);
        scanner.close();
    }

    private int readNumberOfAttempts(){
        System.out.println("Enter number of attempts ");

        return scanner.nextInt();
    }

    private int readNumber(){
        System.out.println("Enter the number from 0 to 9 ");
        return scanner.nextInt();
    }

    private void guessNumber(int attempts){
        while (attempts>0){
            int number = readNumber();
            attempts--;

            if(number==secret){
                System.out.println("You have guessed the secret number!");
                return;
            }else{
                System.out.println("Wrong! You have "+attempts+" attempts left.");
            }

        }
        System.out.println("Sorry buddy. Maybe some other time ");
    }


}
