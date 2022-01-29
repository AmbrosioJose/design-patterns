package Structural.Adapter;

/**
 * Supplies power at 220V. Here Socket class also acts as the client class
 * The power supply is indicated by the volts attribute.
 */
public class Socket {
    public static void main(String args[]){
        String volts = "220V";
        System.out.println("Socket: Supplying power at " + volts);
        Target adapter = new Adapter();
        String resp = adapter.connectAdapter(volts);
        System.out.println("Socket: Response from adapter " + resp);
    }
}
