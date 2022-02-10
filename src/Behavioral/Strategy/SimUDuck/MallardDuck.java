package Behavioral.Strategy.SimUDuck;


/**
 * The type Mallard duck extends Duck class inheriting its variables and methods
 */
public class MallardDuck extends Duck{

    /**
     * Instantiates a new Mallard duck and initialized Fly and Quack behaviours which are the utilized by the
     * inherited methods performQuack and performFLy
     */
    public MallardDuck(){
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }

    public void display(){
        System.out.println("I'm a real Mallard duck");
    }


}
