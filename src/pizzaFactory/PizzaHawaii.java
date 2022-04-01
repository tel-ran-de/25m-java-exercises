package pizzaFactory;

public class PizzaHawaii extends Pizza {
    private static final String TYPE = "Pizza Hawaii";

    public PizzaHawaii(){
        super(TYPE);
    }

    @Override
    protected void prepare() {
        System.out.println("Preparing Pizza with Ananas and Cheese ");
    }
}
