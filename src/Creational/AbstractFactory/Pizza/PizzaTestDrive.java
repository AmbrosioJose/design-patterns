package Creational.AbstractFactory.Pizza;

public class PizzaTestDrive {

    public static void main(String[] args){
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore californiaStore = new CaliforniaPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = californiaStore.orderPizza("cheese");
        System.out.println("Amanda ordered a " + pizza.getName() + "\n");

        pizza = nyStore.orderPizza("clam");
        System.out.println("Daphne ordered a " + pizza.getName() + "\n");

    }
}
