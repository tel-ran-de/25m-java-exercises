package pizzaFactory;

public class PizzaSalami extends Pizza {
    private static String TYPE= "Pizza Salami";

    public  PizzaSalami(){
        super(TYPE);
    }

    public void prepare(){
        System.out.println("Preparing Pizza with Salami, Cheese,Tomatoes");
    }
}
