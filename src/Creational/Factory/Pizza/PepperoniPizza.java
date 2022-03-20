package Creational.Factory.Pizza;

public class PepperoniPizza extends Pizza {

    PepperoniPizza(){
        name = "pepperoni pizza";
        dough = "regular dough";
        sauce = "marinara sauce";
    }

    @Override
    public String toString() {
        return "PepperoniPizza{" +
                "name='" + name + '\'' +
                ", dough='" + dough + '\'' +
                ", sauce='" + sauce + '\'' +
                ", toppings=" + toppings +
                '}';
    }
}
