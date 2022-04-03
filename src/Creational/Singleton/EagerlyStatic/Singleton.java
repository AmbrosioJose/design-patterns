package Creational.Singleton.EagerlyStatic;

public class Singleton {
    String description = "This is a eagerly created instance. Not a lazy one!";

    /**
     * The singleton is created in a static initializer. This is thread safe because we rely on the JVM to create the
     * unique instance of the singleton when the class is loaded. The JVM guarantees that the instance will be created
     * before any thread accesses the static uniqueInstance variable.
     */
    private static Singleton uniqueInstance = new Singleton();

    private Singleton(){}


    public static Singleton getInstance(){
        return uniqueInstance;
    }

    public String getDescription(){
        return description;
    }
}
