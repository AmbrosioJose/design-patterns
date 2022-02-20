package Structural.Decorator.StarbuzzCoffee;


/**
 * The Beverage class with two methods getDescription() and cost()
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
