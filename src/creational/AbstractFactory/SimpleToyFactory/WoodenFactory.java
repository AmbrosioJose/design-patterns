package creational.AbstractFactory.SimpleToyFactory;

public class WoodenFactory implements ToyFactory{
    @Override
    public DuckToy produceDuck(){
        return new WoodenDuck();
    }

    @Override
    public FishToy produceFish(){
        return new WoodenFish();
    }
}
