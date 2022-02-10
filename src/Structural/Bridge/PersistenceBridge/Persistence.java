package Structural.Bridge.PersistenceBridge;

/**
 * This interface abstracts the persistence or saving of the data using different methods
 */
public interface Persistence {
    public void persist(String id);
}
