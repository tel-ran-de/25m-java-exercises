public class Main {

    public static void main(String[] args) {
        int[][] numbers1 = {{5,2,3},{-9,9,0},{7,8,9}};//2
        System.out.println(noNegatives(numbers1));
        System.out.println(sumNoNegativesRows(numbers1));

        for (int i=0;i<10;i++){
            if(i==5) break;
            //       System.out.print(i+" ");
        }
        System.out.println();


        for (int i=0;i<10;i++){
            if(i==5) continue;
            //        System.out.print(i+" ");
        }
        System.out.println();

        int[][] intsArr ={{1,2,3},{4,5,6},{7,8,9}};

        outerFor:
        for(int i=0;i<intsArr.length;i++){
            for(int j=0;j<intsArr[i].length;j++){
                if(i==1)continue outerFor;
                System.out.print(intsArr[i][j]+" ");
            }
            System.out.println();
        }




        int[][] numbers = {{5,2,3},{-9,9,0},{7,8,9}};
        //    System.out.println(sumOfNSubArray(numbers,1));//15
        //    print2Dim(numbers);
        printZeroSumIndex(numbers);

        // 1.Найти сумму всех значений n-го подмассива двумерного массива
        //public static int sumOfNSubArray(int[][] ints, int n)
        //
        //2.вывести на экран все значения двумерного массива
        //public ststic void print2Dim(int[][] array)
        //
        //Вывести на экран номер строки (подмассива) двумерного массива сумма всех элементов которого равна нулю
    }

    // 1.Найти сумму всех значений n-го подмассива двумерного массива
    //public static int sumOfNSubArray(int[][] ints, int n)
    public static int sumOfNSubArray(int[][] ints, int n){
        int sum=0;
        for(int i=0;i<ints[n].length;i++)
        {
            sum+=ints[n][i];
        }
        return sum;
    }
    //2.вывести на экран все значения двумерного массива
    //public ststic void print2Dim(int[][] array)

    public static void print2Dim(int[][] array){
        for(int i=0;i<array.length;i++)
        {
            for(int j=0;j<array[i].length;j++)
            {
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
    }

    //3.Вывести на экран номер строки (подмассива) двумерного массива сумма всех элементов которого равна нулю
    //int[][] numbers = {{1,2,3},{-9,9,0},{7,8,9}};
    public static void printZeroSumIndex(int[][]array){
        for(int i=0;i<array.length;i++){   // length=5  arr[length-1]
            int sumSubarray=0;
            for(int j=0;j<array[i].length;j++) {
                sumSubarray += array[i][j];// sumSubarray= sumSubarray+array[i][j] 1
            }
            if(sumSubarray==0)
                System.out.print(i+"\t");


        }
    }

    //   4* Есть обычный(одномерный) массив целых чисел больше нуля. Вася и Петя задумывают по одному числу.
// Найти наибольшую длину подмассива этого массива, такого что этот подмассив содержит поровну любимого
// числа Васи и Пети. Если такого подмассива не существует, вернуть 0. Подмассив имеется в виду часть
// массива от нулевого элемента и дальше.
//например: (7, 42)-> {6,42,11,7,1,42}-> 5, (7,42)-> {7,42,11,7,1,42}-> 6
    //nt[] array = {7,11,7,1,42}

    public static int belovedNumber(int[]numbers,int vasiaNumber,int petiaNumber){
        int result=0;
        int countVasia=0;
        int countPetia=0;

        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==vasiaNumber)
                countVasia++;

            if(numbers[i]==petiaNumber)
                countPetia++;

            if(countVasia==countPetia)
                result=i+1;
        }
        return  result;
    }
    //int[][] numbers = {{1,2,3},{-9,9,0},{7,8,9}};
    //1.Метод принимает двумерный массив и возвращает количество строк(подмассивов)
    // , в которых нет отрицательных элементов (continue с меткой)
    // public int noNegatives(int[][]arr){}

    public static int noNegatives(int[][]arr){
        int counter =0;

        outerFor:
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]<0)continue outerFor;
            }
            counter++;
        }
        return counter;
    }

    //2.сложить числа в двумерном массиве только из тех подмассивов где нету отрицательных элементов
    //continue  с меткой
    public static int sumNoNegativesRows(int[][]arr){
        int sum=0;

        outerFor:
        for(int i=0;i<arr.length;i++){
            int sumSubarray=0;
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]<0)
                    continue outerFor;
                sumSubarray+=arr[i][j];
            }
            sum+=sumSubarray;
        }
        return sum;
    }

    //3. Метод принимает целочисленный массив, в котором все элементы парные кроме одного. Возвращает
    // не парный элемент
    //{2,2,5,1,5} {3,3,3,3,2}



}
