package Creational.Singleton.OneAndOnly;

public class Main {
    public static void main(String[] args){

        OneAndOnlyOne oneAndOnlyOne = OneAndOnlyOne.getSingletonInstance();
        System.out.println(oneAndOnlyOne.getResource());

        // Not able to create a new instance
        // OneAndOnlyOne oneAndOnlyOne1 = new OneAndOnlyOne();
    }
}
