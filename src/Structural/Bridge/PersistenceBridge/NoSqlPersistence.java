package Structural.Bridge.PersistenceBridge;


/**
 * The class performs persist using NoSQL technology, which is different from the RDBMS theme
 *
 */
public class NoSqlPersistence implements Persistence{
    PersistenceImplementor persistImp = new NoSQLPersistenceImplementor();

    @Override
    public void persist(String id){
        persistImp.insertData(id);
    }
}
