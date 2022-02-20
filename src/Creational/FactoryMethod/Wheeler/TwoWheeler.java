package Creational.FactoryMethod.Wheeler;

public class TwoWheeler extends Wheeler{

    private int wheels;

    public TwoWheeler(int wheels) {
        super(wheels);
        this.wheels = wheels;
    }

    @Override
    public String constructChassis() {
        return wheels + " Wheel Chassis";
    }
}
