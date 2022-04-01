package Creational.AbstractFactory.Pizza;

public class CaliforniaPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        return new VeryThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new WhitePizzaSauce();
    }

    @Override
    public Cheese createCheese(){
        return new VeganMozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies(){
        return new Veggies[]{new Garlic(), new Onion(), new Mushrooms(), new RedPepper()};
    }

    @Override
    public Pepperoni createPepperoni(){
        return null;
    }

    @Override
    public Clams createClams(){
        return null;
    }


}
