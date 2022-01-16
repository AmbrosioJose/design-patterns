package creational.AbstractFactory.SimpleToyFactory;

public class Main {

    public static void main(String[] args){
        WoodenFactory woodenFactory = new WoodenFactory();
        PlasticFactory plasticFactory = new PlasticFactory();

        produceToys(woodenFactory);
        produceToys(plasticFactory);
    }

    public static void produceToys(ToyFactory toyFactory){
        DuckToy duckToy = toyFactory.produceDuck();
        FishToy fishToy = toyFactory.produceFish();

        System.out.println(duckToy.toString());
        System.out.println(fishToy.toString());
    }

}


