package creational.ProtoType.SheepCloning;

public class Sheep implements Cloneable{

    /**
     * Sound a sheep makes
     */
    private String sound;


    /**
     * Eating behaviour of sheep
     */
    private String eatBehavior;

    Sheep(){}

    Sheep(String sound, String eatBehavior){
        this.sound = sound;
        this.eatBehavior = eatBehavior;
    }

    /**
     * @return the sound
     */
    public String getSound() {
        return sound;
    }

    /**
     * @param sound the sound to set
     */
    public void setSound(String sound) {
        this.sound = sound;
    }

    /**
     * @return the eatBehavior
     */
    public String getEatBehavior() {
        return eatBehavior;
    }


    /**
     * @param eatBehavior the eatBehavior to set
     */
    public void setEatBehavior(String eatBehavior) {
        this.eatBehavior = eatBehavior;
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException{
        return (Sheep) super.clone();
    }

    @Override
    public String toString() {
        return "Sheep says " + sound + " then " + eatBehavior;
    }
}
