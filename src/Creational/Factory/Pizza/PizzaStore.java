package Creational.Factory.Pizza;

public class PizzaStore {
    SimplePizzaFactory simplePizzaFactory;

    PizzaStore(SimplePizzaFactory simplePizzaFactory){
        this.simplePizzaFactory = simplePizzaFactory;
    }


    public Pizza orderPizza(String type){
        Pizza pizza;

        pizza = simplePizzaFactory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();


        return pizza;
    }
}
