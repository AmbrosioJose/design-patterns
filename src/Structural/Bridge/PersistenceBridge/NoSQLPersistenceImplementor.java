package Structural.Bridge.PersistenceBridge;

/**
 * NoSQL persistence implementation sample.
 *
 *  Print statements are just to show example of how this implementation could work
 */
public class NoSQLPersistenceImplementor implements PersistenceImplementor{


    @Override
    public void insertData(String id){
        System.out.println("No SQL persistence implementation");
        System.out.println("db.book.insert({ISBN:'" + id + "', title: 'Java Programming', author: 'James Gosling'})");
    }

    @Override
    public void editData(String id){
        System.out.println("No SQL persistence implementation");
        System.out.println("db.book.update({ISBN:'" + id + "'}, {set: {$price:20.20}}");
    }

    @Override
    public String searchData(String id){
        System.out.println("No SQL persistence implementation");
        System.out.println("db.book.find({ISBN:'" + id + "'}");
        return id;
    }

    @Override
    public String deleteData(String id){
        System.out.println("No SQL persistence implementation");
        System.out.println("db.book.delete({ISBN:'" + id + "'}");
        return id;
    }
}
