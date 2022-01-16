package creational.FactoryMethod.Wheeler;

public abstract class Wheeler {

    protected int wheels;

    public Wheeler (int wheels){
        this.wheels = wheels;
    }

    public int getWheels(){
        return wheels;
    }

    public abstract String constructChassis();
}
