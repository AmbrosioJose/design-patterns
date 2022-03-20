package Creational.Factory.Pizza;

public class CheesePizza extends Pizza{

    CheesePizza(){
        name = "cheese pizza";
        dough = "regular dough";
        sauce = "marinara sauce";
    }

    @Override
    public String toString() {
        return "CheesePizza{" +
                "name='" + name + '\'' +
                ", dough='" + dough + '\'' +
                ", sauce='" + sauce + '\'' +
                ", toppings=" + toppings +
                '}';
    }
}
