package Creational.Singleton.DoubleCheckLocking;

public class Singleton {
    public String description = "This singleton uses double checking locking to reduce the use of synchronization in getInstance(). Synchronizing every time getInstance is called can be heavy";

    /*
    * The volatile keyword ensures that multiple threads handle the uniqueInstance variable correctly when it
    * is being initialized to the Singleton instance;
    */
    private volatile static Singleton uniqueInstance;

    private Singleton(){}

    public static Singleton getInstance(){
        // If an instance doesn't exist enter a synchronized block (syncronization only happens the first time, when the
        // instance doesn't exist)
        if(uniqueInstance == null){
            synchronized (Singleton.class){
                // Once in the synchronized block, check again and if still null, create an instance.
                if(uniqueInstance == null){
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }

    public String getDescription(){
        return description;
    }


}
