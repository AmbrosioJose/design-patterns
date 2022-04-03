package Creational.FactoryMethod.Wheeler;

public abstract class Wheeler {

    protected int wheels;

    public Wheeler (int wheels){
        this.wheels = wheels;
    }

    public int getWheels(){
        return wheels;
    }

    // Factory method that must be implemented by subclasses
    public abstract String constructChassis();
}
