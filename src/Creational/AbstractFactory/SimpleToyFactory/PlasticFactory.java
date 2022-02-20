package Creational.AbstractFactory.SimpleToyFactory;

public class PlasticFactory implements ToyFactory {
    @Override
    public DuckToy produceDuck(){
        return new PlasticDuck();
    }

    @Override
    public FishToy produceFish() {
        return new PlasticFish();
    }
}
