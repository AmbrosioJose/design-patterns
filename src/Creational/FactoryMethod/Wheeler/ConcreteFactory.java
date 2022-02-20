package Creational.FactoryMethod.Wheeler;

public class ConcreteFactory implements Factory{

    @Override
    public Wheeler factoryMethod(int wheels){
        if(wheels == 2)
            return new TwoWheeler(wheels);
        else if(wheels == 3)
            return new ThreeWheeler(wheels);
        else if(wheels == 4)
            return new FourWheeler(wheels);
        else return
            null;
    }
}
