import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Average aver = new Average(1,2,3);
        System.out.println(aver.average());

        Triangle triangle =new Triangle(2,5,6);
        System.out.println(triangle.getPerimeter());

    /*    triangle.a=2;
        triangle.b=5;
        triangle.c=6;*/

        System.out.println(triangle.getPerimeter());
        // write your code here

        int[] ints={5,1,6,4,9,8,3}; //8
        int[] ints1={5,9,6,4,9,8,3}; //8
        int[] ints2={1,1,1,1}; //

        find2Largest(ints);
        find2Largest(ints1);
        find2Largest(ints2);

        secondMinElt(ints);//3
        secondMinElt(ints2);//

        int[] ints3={13,13,1,3,1};
        System.out.println(findSingle(ints3));//3



    }

    // display second max of int array
    public static void find2Largest(int arr[]){
        Arrays.sort(arr);

        // 1,2,78,78

        for(int i=arr.length-2;i>=0;i--)
        {
            if(arr[i]!=arr[arr.length-1])
            {
                System.out.println("The second largest element is "+arr[i]);
                return;
            }
        }
        System.out.println("There is no second largest element");
    }

    // display smallest and second smallest without sorting the array.

    public static void secondMinElt(int[] arr){
        int firstMinElement;
        int secondMinElement;

        firstMinElement=arr[0];
        secondMinElement=Integer.MAX_VALUE;

        for(int i=1;i<arr.length;i++){//5,7,1,0,25
            if(arr[i]<firstMinElement){
                firstMinElement=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]<secondMinElement && arr[i] != firstMinElement){
                secondMinElement=arr[i];
            }
        }
        if(secondMinElement==Integer.MAX_VALUE)
            System.out.println("No second smallest element");
        else
            System.out.println("The smallest element is "+firstMinElement+" and second min is "
                    +secondMinElement);
    }

    // 3. the method accepts an array where all but one  numbers have pairs . Find the number which has no pair

    public static int findSingle(int[] numbers){
        //5,5,3,3,2 5^5^3^3^2
        int res =0;
        for(int num: numbers){ //for(int i=0;i<numbers.length,i++
            res^=num; //res+=num
        }
        return res;
    }
    // && &   10001    true && false=false  1&&0  false&&false=false 0&&0
    //       00101
    //         001

    //1  0001
    //3  0011
    //   0010

    // 1.Create a class named "student.Student" containing  variable String  'name' and  integer variable 'number'.
    //Assign the value of number =2 and value of name is "Petr" by creating an object of the class student.Student
    //Create two more objects of the class student.Student



    //2.Write a program to print perimeter of a triangle with sides 3,4,5 by creating a class 'Triangle' without
    // any parameter in constructor



    //3.Write a program to print   perimeter of a triangle with sides 3,4,5 by creating a
    // class 'Triangle' with constructor having the three sides as its parameters

    //4.Write a program to print the area and perimenter of a rectangle by creating a class named "Rectangle" .
    //Create methods getArea and getPerimenter to calculate area and perimenter in that class. Length and breadth
    // should be variables of the class passed via constructor. Create two objects with sides(4,5) and (5,8) and
    // calculate their perimenter and area

    //5. Print the average of three numbers by creating a class named "Average" having a method to calculate and
    // print the average. The class should have a constructor

    //6, Write a program by creating an "Employee" class having the following methods and print the final salary.
    // - constructor which accepts the salary, numbers of employee's working hours  per day as parameters
    // - 'addSalary()' method which adds $10 to the salary of the employee if it is less than $500
    // - "addWork()" method which adds $5 to the employee's salary if the number of working hours per day is
    // more than 6 hours
}
