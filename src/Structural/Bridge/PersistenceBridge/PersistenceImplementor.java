package Structural.Bridge.PersistenceBridge;

/**
 * The main PersistenceImplementor interface, that defines crud operations
 */
public interface PersistenceImplementor {
    public void insertData(String id);
    public void editData(String id);
    public String searchData(String id);
    public String deleteData(String id);
}
