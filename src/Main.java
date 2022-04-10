public class Main {
    public static void main(String[] args) {

        Order o1= new Order(1,"order1");
        Order o2= new Order(1,"order1");
        Order o3= new Order(2,"order2");

        System.out.println(o1==o2);//false
        System.out.println(o1.equals(o2));//true
        System.out.println(o1.equals(o3));//false

        // создать класс Order с переменными int id String name
        // создать несколько обьектов этого класса,
        // в том числе  одинаковые  и сравнить их между собой




    }
}
