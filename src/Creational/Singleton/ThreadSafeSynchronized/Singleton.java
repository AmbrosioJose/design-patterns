package Creational.Singleton.ThreadSafeSynchronized;

/**
 * The type Singleton.
 */
public class Singleton {
    private String description = "This is a thread safe singleton";
    private static Singleton uniqueInstance;

    private Singleton(){}


    /**
     * Get instance singleton. Notice that it is synchronized which means that if multiple threads try to get an instance
     * for the first time it will never result in multiple instances because the synchronized keyword forces every thread
     * to wait its turn before it can enter the method.
     *
     * @return the singleton
     */
    public static synchronized Singleton getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    public String getDescription(){
        return description;
    }
}
