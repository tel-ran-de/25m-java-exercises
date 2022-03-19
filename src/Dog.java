public class Dog {
    private String name;
    private int age;
    private static int dogCount;

    public Dog(String name,int age){
        this.name=name;
        this.age=age;
        dogCount++;
    }

    public static void setDogCount(int dogCount){
        Dog.dogCount=dogCount;
    }
    public  static  int getDogCount(){
        return dogCount;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setAge(int age){
        if(age<0)
            System.out.println("Age cannot be negative");
        else{
            this.age=age;
        }
    }
    public String toString(){
        return "name= "+name+", "+"age="+age;
    }
}
