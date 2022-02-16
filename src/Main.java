public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(sumOfFive(5));
    }

    // 1. написать метод, печатающий цифры от 1 до 10
    public static void print10Numbers(){
        int i=1;
        while(i<=10){
            System.out.println(i);
            i++;
        }
    }
    //2.написать метод, возвращающий сумму цифр от 1 до n
    public static int sumOfFive (int n){
        int i=1;
        int sum=0;

        while(i<=n){
            sum+=i;
            i++;

        }
        return sum;

    }
    // 3.написать метод, выводящий на экран результат умножения данного
    // числа n на все целые числа от 0 до n
    //4*. вывести на экран таблицу умножения
    //5- Вывести на экран треугольник состоящий из цифр до числа n
    //1
    //12
    //123
    //1234
    //12345

    //6.
    //1
    //22
    //333
    //4444



}
