public class Main {

    public static void main(String[] args) {
        // write your code here  abbbcc

        String input ="abbbcccc";
        String input1 ="";
        //    System.out.println(getLongestLength(input));
    }

    public  int getLongestLength(String input){
        int count =1;
        int max=1;

        for(int i=0;i<input.length()-1;i++){
            if(input.substring(i,i+1).equals(input.substring(i+1,i+2))){
                count++;
            } else{
                count=1;
            }
            if(count>max){
                max=count;
            }
        }
        return max;
    }

    //Написать метод, находящий макс. элемент массива целых чисел и протестировать его.
    //Написать трансформеры на интерфейсах с такими условиями: in lower case at length 2
    // in uppercase at length 3  и протестировать их
}
