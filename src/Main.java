public class Main {
    // 1.create class Dog ,create several dog objects and print the number of objects created
    // on the screen. Each Dog should have name and age. Add getters and setters. All
    // variables should be private. Setter method for dog's age should not allow negative
    // age

    //2.create two classes: Address with the fields street and houseNumber, constructor etc
    //and Person with fields name and address, constructor, getters etc.
    // create the third class AddressGetter which accepts an array of persons and returns an array
    // of their addresses

    public static void main(String[] args) {

        System.out.println(Dog.getDogCount());

        Dog dog1=new Dog("Sharik",3);
        Dog dog2=new Dog("Tuzik",4);

        System.out.println(Dog.getDogCount());

        System.out.println(dog1);
        System.out.println(dog2);

        Dog.setDogCount(50);
        System.out.println(Dog.getDogCount());

        System.out.println(Employee.counter);
        Employee vasia = new Employee("Vasia",1000,8,1);//1005
        Employee vasia1 = new Employee("Vasia1",490,5,2);//500
        Employee vasia2 = new Employee("Vasia2",490,9,3);//505
        Employee vasia3 = new Employee("Vasia3",501,5,4);//501

        System.out.println(Employee.counter);

        vasia.addSalary();
        vasia.addWork();

        vasia1.addSalary();
        vasia1.addWork();

        vasia2.addSalary();
        vasia2.addWork();

        vasia3.addSalary();
        vasia3.addWork();

        vasia.getSalary();
        vasia.setSalary(2000000000);

        System.out.println(vasia.getSalary());
        System.out.println(vasia1.getSalary());
        System.out.println(vasia2.getSalary());
        System.out.println(vasia3.getSalary());


        int[]array= {4,1,7,1};

        MaxInArray maxInArray = new MaxInArray(array);
        System.out.println(maxInArray.max());



        System.out.println(Calculator.plus(1,4));
        System.out.println(Calculator.minus(1,4));
        System.out.println(Calculator.divide(1,4));
        System.out.println(Calculator.multiply(1,4));
        System.out.println(Calculator.percent(4,50));
        // write your code here
    }
    // calculator

}
