package Creational.AbstractFactory.Pizza;

public abstract class Pizza {
    String name;

    Dough dough;
    Sauce sauce;
    Cheese cheese;
    Veggies veggies[] = new Veggies[]{};
    Pepperoni pepperoni;
    Clams clams;



    abstract void prepare();

    void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String toString() {
        StringBuffer display = new StringBuffer();
        display.append("--- " + name + " ---\n");
        if(pepperoni != null)
            display.append(dough.toString() + "\n");
        display.append(sauce.toString() + "\n");
        display.append(cheese.toString() + "\n");
        if(pepperoni != null)
            display.append(pepperoni.toString() + "\n");
        if(clams != null)
            display.append(clams.toString() + "\n");
        for (Veggies veggie : veggies) {
            display.append(veggie.toString() + "\n");
        }

        return display.toString();
    }
}
