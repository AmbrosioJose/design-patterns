package creational.ProtoType.SheepCloning;

import java.util.Objects;

public class Main {
    public static void main(String[] args){
        Sheep sheep = new Sheep();
        sheep.setEatBehavior("eats apples");
        sheep.setSound("BAAAH!!");


        try{
            Sheep sheepClone = (Sheep) sheep.clone();
            System.out.println(sheepClone.toString());
            if(Objects.equals(sheep.getSound(), sheepClone.getSound()) && Objects.equals(sheep.getEatBehavior(), sheepClone.getEatBehavior())){
                System.out.println("Clone: "+sheepClone.toString());
                System.out.println("Sheep successfully cloned");
            }
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}
