package creational.FactoryMethod.Wheeler;

public interface Factory {

    /*
    *  The factory() method sets the number of wheels of the product
    *  Passing a value of 2 produces a 2 wheeler
    *  Passing a value of 3 produces a 3 wheeler
    *  Passing a value of 4 produces a 4 wheeler
    */
    public Wheeler factoryMethod(int Wheels);
}
