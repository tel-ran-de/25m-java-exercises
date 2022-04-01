public class Main {

    public static void main(String[] args) {
        // написать игру Угадай число, в которой за ограниченное число попыток
        //        //        ввода числа с клавиатуры нужно угадать секретное число от 0 до 9.
        //        //     * Условия:
        //        //     * -Код игры должен находиться в классе GameGuessNumber
        //        //     * -Класс GameGuessNumber должен содержать две статические переменные
        //        //     scanner для ввода чисел с клавиатуры и secret, в которой записано секретное число
        //        //     * -Класс GameGuessNumber должен содержать следующие методы (могут быть и другие по
        //        //     * желанию): int readNumberOfAttempts()-считывает количество предоставляемых попыток
        //        //     *           int readNumber() - считывает вводимое число
        //        //     *           void guessNumber(int attempts) содержит логику игры
        GameGuessNumber game = new GameGuessNumber();
        game.start();


    }
}
