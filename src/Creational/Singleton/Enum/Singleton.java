package Creational.Singleton.Enum;

/**
 * The enum Singleton is a singleton that leverages the power of enums to make it type safe.
 */
public enum Singleton {
    UNIQUE_INSTANCE;

    String description = "I'm a thread safe Singleton that uses Enum";

    public String getDescription() {
        return description;
    }
}
