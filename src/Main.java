public class Main {
    public static void main(String[] args) {
        Address address1= new Address("Street1",56);
        Address address2= new Address("Street2",48);
        Person person1=new Person("Person1",address1);
        Person person2=new Person("Person2",address2);

        Person[]persons={person1,person2};
        AddressGetter addressGetter = new AddressGetter(persons);
        System.out.println(addressGetter);
    }
    /**
     * 1.создать классы содержащие методы для подсчета площади прямоугольника
     * квадарата и круга. Кроме результата подсчета должно выводиться также
     * название соответствующей фигуры. Создать массив таких обьектов и вывести
     * его на экран
     * Прямоугольник1 имеет площкдь 50
     * Круг имеет площадь 20
     *
     *
     * 2.написать игру Угадай число, в которой за ограниченное число попыток ввода числа
     * с клавиатуры нужно угадать секретное число от 0 до 9
     * Условия:
     * -Код игры должен находиться в классе GameGuessNumber
     * -Класс GameGuessNumber должен содержать две статические переменные scanner для ввода чисел с
     * клавиатуры и secret, в которой записано секретное число
     * -Класс GameGuessNumber должен содержать следующие методы (могут быть и другие по
     * желанию): int readNumberOfAttempts()-считывает количество предоставляемых попыток
     *           int readNumber() - считывает вводимое число
     *           void guessNumber(int attempts) содержит логику игры
     */

}
