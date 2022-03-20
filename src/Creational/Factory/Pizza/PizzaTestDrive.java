package Creational.Factory.Pizza;

public class PizzaTestDrive {

    public static void main(String[] args){
        SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(simplePizzaFactory);

        Pizza cheesePizza = pizzaStore.orderPizza("cheese");
        System.out.println("We ordered a " + cheesePizza.getName() + "\n");
        System.out.println(cheesePizza);

        Pizza veggiePizza = pizzaStore.orderPizza("veggie");
        System.out.println("\nWe ordered a " + veggiePizza.getName() + "\n");
        System.out.println(veggiePizza);
    }
}
