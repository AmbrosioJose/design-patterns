package Creational.Singleton.Classic;

/**
 * A singleton pattern example.
 * Note the Singleton pattern can have some unexpected issues when working with multiple threads.
 *
 * possible solutions:
 *
 * - synchronizing the getInstance method is easy but can be expensive. It can decrease performance by a factor
 * of 100. (only use if the getInstance() method isn't causing substantial overhead to the application. So ig in a
 * high-traffic part of the code, reconsider this option)
 *
 * - Use an eagerly created instance rather than a lazily created one. Lazily created means that it is only created when
 * it is called. Eagerly created meaning it is created before it is used(in our example we use the JVM using static initializer)
 *
 * - Use "double-checked locking"  to only enter a synchronized block when there is no instance of the singleton and
 * then checking again if the singleton instance exists when inside the synchronized block.
 */
public class Singleton {
    public String description = "This is a singleton";
    private static Singleton uniqueInstance;

    // The constructor is declared private so that it can only be instantiated by the Singleton class.
    private Singleton() {}

    // Provides a way to instantiate the Singleton class and to return an instance of it.
    public static Singleton getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    public String getDescription(){
        return description;
    }


}
