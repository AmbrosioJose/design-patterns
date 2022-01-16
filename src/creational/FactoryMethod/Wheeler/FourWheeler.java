package creational.FactoryMethod.Wheeler;

public class FourWheeler extends Wheeler{
    private int wheels;

    FourWheeler(int wheels){
        super(wheels);
        this.wheels = wheels;
    }

    @Override
    public String constructChassis(){
        return wheels + " Wheel Chassis";
    }
}
