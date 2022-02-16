public class Main {

    public static void main(String[] args) {
        //    int result = sum(2,4);//=6
        //    System.out.println(result);
        int a =1;
        int b =2;
        System.out.println("First number="+a+" Second number= "+b+" Sum= "+sum(a,b));//3
        System.out.println(sum(3,4));//7
        System.out.println(sum(5,5));//10





        // write your code here
    }
    // 1. Написать метод, возвращаюший сумму двух целых чисел

    static int sum(int n1,int n2){//1,2
        int s = n1+n2;//3
        return s;//3
    }



    // 2. Написать метод, возвращающий результат деления двух целых чисел
    static double divide (double a, int b){
        return a/b;
    }

    //3. Написать метод, возвращающий значение целой переменной в квадрате (n*n) n->n*n
    // 4. Пусть цена товара А обычно составляет 1000 евро, а товара В 500 евро. если клиент покупает товары вместе,
    //то на них действует скидка 100 евро на всю покупку. Написать метод, возвращающий стоимости товара А и В со скидкой
    // Напиать метод в общем виде.
}
