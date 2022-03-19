public class Employee {

    String name;
   private int salary;
    int numberOfHours;
    static int counter;

    public int getSalary(){
        return this.salary;
    }

    public void setSalary(int salary){
        this.salary=salary;
    }

    public Employee(String name, int salary, int numberOfHours,int id) {
        this.name = name;
        this.salary = salary;
        this.numberOfHours = numberOfHours;

        counter++;
    }

    public void addSalary(){
        if(salary<500)
            salary=salary+10;
    }

    public void addWork(){
        if(numberOfHours>6)
            salary=salary+5;
    }
}
