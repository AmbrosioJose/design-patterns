package creational.FactoryMethod;

public class Main {
    public static void main(String [] args){
        Factory factory = new ConcreteFactory();

        TwoWheeler twoWheeler = (TwoWheeler) factory.factoryMethod(2);
        ThreeWheeler threeWheeler = (ThreeWheeler) factory.factoryMethod(3);
        Wheeler wheeler = factory.factoryMethod(4);

        Wheeler[] wheelers = {twoWheeler, threeWheeler, wheeler};


        System.out.println("Currently in our lot we have these products with: ");
        for(Wheeler product : wheelers){
            System.out.println(product.getWheels() + " wheels");
        }

    }
}
