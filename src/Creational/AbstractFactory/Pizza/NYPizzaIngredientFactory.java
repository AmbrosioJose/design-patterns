package Creational.AbstractFactory.Pizza;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{

    @Override
    public Dough createDough(){
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce(){
        return new MarinaSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new Garlic(), new Onion(), new Mushrooms(), new RedPepper()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }
}
