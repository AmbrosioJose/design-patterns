package Creational.Factory.Pizza;

public class ClamPizza extends Pizza{

    ClamPizza(){
        name = "clam pizza";
        dough = "regular dough";
        sauce = "white sauce";
    }

    @Override
    public String toString() {
        return "ClamPizza{" +
                "name='" + name + '\'' +
                ", dough='" + dough + '\'' +
                ", sauce='" + sauce + '\'' +
                ", toppings=" + toppings +
                '}';
    }
}
