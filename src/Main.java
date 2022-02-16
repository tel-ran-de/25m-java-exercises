import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //    multiplication(4);
        //    cube(2);
        //    multiplicationTable();
        //    triangle(6);
        //    triangleSame(6);
        //   print10();
        //   System.out.println(sum(3));
        inputAndCalculate();

        // write your code here
        //метод, выводящий на экран результат умножения числа n на все целые числа от о
        // до n

    }
    public static void multiplication(int n){
        int i=0;
        while(i<=n){
            System.out.println(n*i);
            i++;
        }
    }

    //написать метод, печатающий куб чисел от 1 до данного числа n
    public static void cube(int n){
        int i=1;

        while (i<=n){
            System.out.println(i*i*i);
            i++;
        }
    }

    //multiplication table

    public static void multiplicationTable(){
        int i=1;
        while(i<=9){
            int j =1;
            while(j<=9){
                System.out.println(j*i);
                j++;
            }
            System.out.println("******************");
            i++;
        }
    }

    //1
    //12
    //123
    public static void triangle(int n){
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=i){
                System.out.print(j);
                j++;
            }
            i++;
            System.out.println();
        }
    }

    //1
    //22
    //333

    public static void triangleSame(int n){
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=i){
                System.out.print(i);
                j++;
            }
            i++;
            System.out.println();
        }
    }

    //1. write method to print numbers from 1 to 10
    public static void print10(){
        for(int i=1;i<=10;i++)
            System.out.println(i);
    }
    //2. write method to calculate the sum of first n int numbers
    public static int sum(int n){
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum+=i;
        }
        return sum;
    }
    //3. write method that asks user to input a positive integer.The method then
    // prints multiplication table of that number
    public static void inputAndCalculate(){
        Scanner sc =new Scanner(System.in);
        int num;

        System.out.println("Enter any positive integer: ");
        num=sc.nextInt();

        System.out.println("Multiplication table of "+ num);

        for(int i=1;i<=10;i++)
        {
            System.out.println(num*i);
        }
    }

    //4. write method to find factorial of n
    // 5!=5*4*3*2*1
    public static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++)
            fact *=i;
        return fact;
    }


    //5. Написать метод, находящий заданное число n в степени в заданной степени m
    // (Do not use Java built-in methods!)
    // 6.Write method where a do-while loop that prompts user to enter two numbers.
    // The method should then add the numbers and display the sum.
    // the loop should ask if the user wants to repeat the operation(1-to repeat,
    // any other digit to terminate). And repeat it if 1 is entered
    // 7.write a method to find a Fibonacci number
    // 0,1,1,2,3,5,8,13,21,34
}
