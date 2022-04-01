package pizzaFactory;

public class PizzaMozarella extends Pizza {
    private static String TYPE = "Pizza Mozarella";

    public PizzaMozarella(){
        super(TYPE);
    }

    public void prepare(){
        System.out.println("Preparing Pizza with Mozarella cheese");
    }
}
