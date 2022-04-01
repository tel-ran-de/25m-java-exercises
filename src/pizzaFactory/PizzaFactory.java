package pizzaFactory;

public class PizzaFactory {

    public Pizza createPizza(PizzaType type){

        switch (type) {
            case PIZZA_HAWAII: return new PizzaHawaii();
            case PIZZA_SALAMI: return new PizzaSalami();
            case PIZZA_MOZARELLA: return new PizzaMozarella();
            default:return null;
        }

    }
}
