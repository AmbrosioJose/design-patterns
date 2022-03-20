package Creational.Factory.Pizza;

import java.util.ArrayList;
import java.util.Arrays;

public class VeggiePizza extends Pizza{

    VeggiePizza(){
        name = "veggie pizza";
        dough = "regular dough";
        sauce = "marinara sauce";
        toppings = new ArrayList<String>(Arrays.asList("bell peppers, ", "onion", "olives"));
    }

    @Override
    public String toString() {
        return "VeggiePizza{" +
                "name='" + name + '\'' +
                ", dough='" + dough + '\'' +
                ", sauce='" + sauce + '\'' +
                ", toppings=" + toppings +
                '}';
    }
}
