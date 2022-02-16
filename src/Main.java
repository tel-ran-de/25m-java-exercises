import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        sumLoop();
        int number =power(2,3);
        System.out.println(number);//8
        //переставить первую букву в конец строкт (abcd->bcda)
        //переставить последнюю букву в начало строки(abcd->dabc
        //написать метод, проверяющий образована ли строка сдвигом букв
        //abc-cab-bca  public boolean isCycle(String str1, String str2)
        // str1=abc, str2= cab -> true
        //str1=abc, str2= acb -> false

        System.out.println(fibonacci(3));//2
    }

    //Написать метод, находящий заданное число в заданной степени число n в степени m
    static int power  (int base, int power){
        int result=1;

        for (int i=1;i<=power;i++){ //2*2*2
            result=result*base;//2*2*2=8
        }
        return result;

    }

    //2.Write a method where a do-while loop prompts user to enter two numbers.
    // The method should then add the numbers and display the sum. The loop
    // should then ask if the user wants to repeat the
    // operation(1-to repeat, any other digit to terminate). And repeat it if 1 is entered

    public static void sumLoop(){
        Scanner sc= new Scanner(System.in);
        int number1,number2;
        int choice;

        do
        {
            System.out.println("Enter the first number");
            number1=sc.nextInt();

            System.out.println("Enter the second number");
            number2=sc.nextInt();

            int sum =number1+number2;
            System.out.println("Sum of numbers: "+sum);

            System.out.println("to continue press 1. Else enter any other digit");
            choice=sc.nextInt();

            System.out.println();

        }while (choice==1);
    }

    //.write a method to find a Fibonacci number by its number in the row e.g. F0=0,;F1=1;F2=1; F3=2; F4=3 etc.
    //// 0,1,1,2,3,5,8,13,21,34   fibn where n =3

    public static int fibonacci(int n){
        if(n<2)return n;

        int fib1=0;
        int fib2=1;
        int fNew=0;

        for (int i=2;i<=n;i++){//n=6
            fNew=fib1+fib2;//0+1=1  fibNew=3+5=8
            fib1=fib2;// fib1=5
            fib2=fNew;// fib2=8
        }
        return fNew;

    }
}
