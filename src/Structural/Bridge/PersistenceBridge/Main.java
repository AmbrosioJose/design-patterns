package Structural.Bridge.PersistenceBridge;


/**
 * Main class is the client class. It can implement both persistence models - and NoSQLPersistence
 * When you run the main class, compare the difference between the implementations and both are entirely different,
 * however, they are indeed persisting the sa,e object with same data/
 * You can implement the other persistence operation such as edit, search, and delete in a similar way.
 */
public class Main {
    public static void main(String[] args){
        SQLPersistence sqlPersistence = new SQLPersistence();
        sqlPersistence.persist("cyberpunk123456");

        NoSqlPersistence nsp = new NoSqlPersistence();
        nsp.persist("cyberpanda123456");

    }
}
