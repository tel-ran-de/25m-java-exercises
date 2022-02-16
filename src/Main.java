public class Main {
    public static void main(String[] args) {
        int[]ints={3,5,7,23,67};
        System.out.println(isProduct(ints,21));//true
        System.out.println(isProduct(ints,23));//false//
        System.out.println(isProduct1(ints,21));//true//
        System.out.println(isProduct1(ints,23));//false//

        //  1**.есть массив целых чисел .написать метод который возвращает true если в массиве существуют
// два таких числа произведение которых равно заданному числу
// {3,5,7,23,67}, 21 -> true
//{3,5,7,23,67}, 23 -> false
        // public static boolean isProduct(int[]numbers, int product)


//2**  "aabbbbccd" ->"2a4b2cd"

        //3       "2a4b2cd"-> "aabbbbccd"


    }

    //  1**.есть массив целых чисел .написать метод который возвращает true если в массиве существуют
// два таких числа произведение которых равно заданному числу
// {3,5,7,23,67}, 35 -> true
//{3,5,7,23,67}, 23 -> false
    // public static boolean isProduct(int[]numbers, int product)
    public static boolean isProduct(int[]numbers, int product){
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[i]*numbers[j]==product){
                    return true;}
            }
        }
        return false;
    }
    // {3,5,7,23,67}, 35 -> true
    public static boolean isProduct1(int[] numbers,int product){
        int i=0;
        int j=numbers.length-1;

        while(j-i>0){
            int localProduct = numbers[i]*numbers[j];

            if(localProduct<product){
                i++;
            } else if(localProduct>product){
                j--;
            }else
                return true;
        }
        return false;
    }


}
