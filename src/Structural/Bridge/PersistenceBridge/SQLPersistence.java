package Structural.Bridge.PersistenceBridge;

/**
 * Implements persistence abstraction for SQL persistence implementation. Uses SQL commands for persisting the data.
 */
public class SQLPersistence implements Persistence{

    PersistenceImplementor persistImp = new SQLPersistenceImplementor();
    @Override
    public void persist(String id){
        // call appropriate persistence operation
        persistImp.insertData(id);
    }
}
