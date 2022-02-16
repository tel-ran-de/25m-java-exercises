public class Main {
    public static void main(String[] args) {
        // write your code here
        System.out.println(square(3));//9
        System.out.println(purchase(1000,500,100));//1400

        System.out.println(isSleeping(false,false));//true
        System.out.println(isSleeping(true,false));//false

        System.out.println(sumDouble(1,2));//3
        System.out.println(sumDouble(2,2));//8
        System.out.println(isTen(10,1));//true
        System.out.println(isTen(1,10));//true
        System.out.println(isTen(6,4));//true
        System.out.println(isTen(6,6));//false
        isPositive(1);
        isPositive(0);
        isPositive(-1);
        areEqual(1,1,1);
        areEqual(1,2,1);
        areEqual(1,2,3);



    }

    public static int square(int n){
        int result = n*n;
        return result;
    }

    public static int purchase (int priceA, int priceB, int discount){
        int result = priceA+priceB-discount;

        return result;
    }

    //1. Вася спит днем если он не работает или у него отпуск. Переменная weekday =
    //true если это рабочий день, перменная  vacation = true  если у него отпуск.
    // напишите метод возвращающий  true  если
    // напишите метод возвращающий  true  если Вася спит
    //isSleeping(weekday,vacation)
    // isSleeping (false, false)-> true
    // isSleeping (true,false) -> false
    // isSleeping(false,true) -> true

    public static boolean isSleeping (boolean weekday,boolean vacation){
        return !weekday || vacation; // !false || false =      true || false = true
        // true || true = true
        // true || false = true


    }

    //2. напишите метод, возвращающий сумму двух целых чисел. А в случае, если эти
    // числа равны, возвращающий двойную сумму
    // sumDouble(1,2)->3
    // sumDouble(2,2)->8

    public static int sumDouble(int a, int b){
        int sum = a+b;

        if(a==b){
            sum=sum*2;}

        return sum;
    }

    //3. Даны два целые числа а и в. Написать метод, возвращающий  true если одно
    // из чисел 10 или их сумма равна 10
    // isTen(9,10)-> true
    // isTen(9,9)-> false
    // isTen(1,9)-> true

    public static boolean isTen(int a, int b){
        return a==10 || b==10 || a+b==10;



    }

    //4. Напишите метод,который принимает целое число и выводит на экран
    // является ли оно положительным, отрицательным или нулем
    public static  void isPositive (int n){
        if(n>0) {
            System.out.println("Number is positive");
        }else if(n<0){
            System.out.println("Number is negative");
        }else {
            System.out.println("Number is zero");

        }

    }

    //5. напишите метод, который принимает три числа и печатает "Вме числа равны" если они
    // равны,  если они разные "Все числа разные" и  если какие то равны то "Некоторые из чисел равны"

    public static void  areEqual (int x, int y, int z){
        if(x==y && x==z ){
            System.out.println("All numbers are equal");
        } else if (x==y||x==z|| z==y){
            System.out.println("Some numbers are equal");
        }else {
            System.out.println("All numbers are different");
        }
    }

    // *  Написать метод, определяющий является ли год високосным. Учесть все условия високосности года


    // Воспитательница в детском саду знала, что если Вася и Петя оба смеются или оба выглядят
    // очень серьезно, то они оба что-то затевают и
}
