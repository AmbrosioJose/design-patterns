package Behavioral.Strategy.SimUDuck;

/**
 * The type Mini duck simulator is a program that simulates ducks.
 */
public class MiniDuckSimulator {

    public static void main(String[] args){
        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        Duck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.performQuack();
        modelDuck.performFly();


        modelDuck.setFlyBehaviour(new FlyRocketPowered());
        modelDuck.performFly();
    }
}
