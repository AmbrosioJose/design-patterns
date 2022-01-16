package creational.FactoryMethod;

public class ThreeWheeler extends Wheeler{
    private int wheels;

    public ThreeWheeler(int wheels){
        super(wheels);
        this.wheels = wheels;
    }

    @Override
    public String constructChassis(){
        return wheels + " Wheel Chassis";
    }

}
