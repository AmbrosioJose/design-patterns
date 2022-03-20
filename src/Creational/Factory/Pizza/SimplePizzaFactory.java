package Creational.Factory.Pizza;

public class SimplePizzaFactory {

    public Pizza createPizza(String type){
        Pizza pizza = switch (type) {
            case "cheese" -> new CheesePizza();
            case "pepperoni" -> new PepperoniPizza();
            case "clam" -> new ClamPizza();
            case "veggie" -> new VeggiePizza();
            default -> null;
        };

        return pizza;
    }
}
