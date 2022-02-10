package Behavioral.Strategy.SimUDuck;

/**
 * Duck abstract class that delegates it's flying and quacking behaviour.
 * <p>
 * Each duck object will set these variables polymorphically to reference the specific behaviour type it would
 * like at runtime.
 * <p>
 * Note: We should not program to implementations which is what we are doing in the constructor but we will find better
 * solutions later. Still this does provide flexibility to change behaviours at runtime(through polymorphism).
 * Instead of inheriting their behaviour, the ducks get their behaviour by being composed with the right behaviour.
 * The duck class is uses composition since it is composed of quack and fly behaviours.
 *
 * DESIGN PRINCIPLE: Favor composition over inheritance
 * DESIGN PRINCIPLE: Program to an interface, not an implementation. (Note we don't follow this rule in this case)
 */

public abstract class Duck {


    /**
     * The Quack behaviour is an example of composition. The duck class HAS-A.
     */
    protected QuackBehaviour quackBehaviour;
    protected FlyBehaviour flyBehaviour;

    /**
     * Perform quack by delegating to the respective behaviour class
     */
    public void performQuack(){
        quackBehaviour.quack();
    }

    /**
     * Perform fly by delegating to the respective behaviour class
     */
    public void performFly(){
        flyBehaviour.fly();
    }

    public void swim(){
        System.out.println("All ducks float even the decoys");
    }

    public void display(){}


    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        System.out.println("Setting new QuackBehaviour");

        this.quackBehaviour = quackBehaviour;
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        System.out.println("Setting new FlyBehaviour");
        this.flyBehaviour = flyBehaviour;
    }
}
