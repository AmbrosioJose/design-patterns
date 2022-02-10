package Behavioral.Strategy.SimUDuck;

public class MuteQuack implements QuackBehaviour{
    @Override
    public void quack(){
        System.out.println("...");
    }
}
