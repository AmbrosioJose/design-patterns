package Structural.Decorator.StarbuzzCoffee;


/**
 * The Condiment decorator is made interchangable with the Beverage class by extending it.
 */
public abstract class CondimentDecorator extends Beverage{

    /**
     * Reimplement getDescription() even though Beverage has it
     *
     * @return String
     */
    public abstract String getDescription();
}
