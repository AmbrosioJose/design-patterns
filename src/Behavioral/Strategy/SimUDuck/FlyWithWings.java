package Behavioral.Strategy.SimUDuck;

public class FlyWithWings implements FlyBehaviour{

    @Override
    public void fly(){
        System.out.println("flap flap");
    }
}
