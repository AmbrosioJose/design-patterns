package Structural.Bridge.PersistenceBridge;

/**
 * Provides the SQL persistence Implementation using SQL statements
 */
public class SQLPersistenceImplementor implements PersistenceImplementor{

    @Override
    public void insertData(String id){
        System.out.println("SQL persistence implementation");
        System.out.println("INSERT INTO BOOK('"+ id + "', 'TITLE', 'AUTHOR') VALUES ('123456789') book SET price = 19.99 WHERE ISBN = '" + id + "';");
    }

    @Override
    public void editData(String id){
        System.out.println("SQL persistence implementation");
        System.out.println("UPDATE BOOK SET price = 19.99 WHERE ISBN = '" + id + "';");
    }

    @Override
    public String searchData(String id){
        System.out.println("SQL persistence implementation");
        System.out.println("SELECT * FROM BOOK WHERE ISBN = '" + id + "';");
        return id;
    }

    @Override
    public String deleteData(String id){
        System.out.println("SQL persistence implementation");
        // Do Something
        return id;
    }

}
