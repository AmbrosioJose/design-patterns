package Behavioral.Strategy.SimUDuck;

public class FlyRocketPowered implements FlyBehaviour{

    @Override
    public void fly(){
        System.out.println("Flying with a rocket. To infinity and beyond!");
    }
}
