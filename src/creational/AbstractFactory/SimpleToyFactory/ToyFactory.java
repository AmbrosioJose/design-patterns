package creational.AbstractFactory.SimpleToyFactory;

public interface ToyFactory {
    abstract DuckToy produceDuck();
    abstract FishToy produceFish();
}
