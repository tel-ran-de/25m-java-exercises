package enum_game;

public class Main {
    //1.написать программу , которая при вводе с клавиатуры дня недели отвечает
    // на вопрос является ли этот день выходным. ( для выходного ответ it is true , для рабочего
    // it is false.  Использовать в решении класс типа ENUM . Вам может понадобиться метод этого класс
    // valueOf
    //DayOfWeek day=DayOfWeek.valueOf("Wednesday");
    public static void main(String[] args) {
        DayOfWeekResolver resolver = new DayOfWeekResolver();
        resolver.start();
    }
}
