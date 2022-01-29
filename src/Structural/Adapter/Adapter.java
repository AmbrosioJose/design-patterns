package Structural.Adapter;

/**
 * The adapter class connecting computer to the socket
 */
public class Adapter implements Target{

    @Override
    public String connectAdapter(String volts){
        System.out.println("Adapter: Received from Adapter " + volts);
        Computer computer = new Computer();
        String resp = "";
        if(volts.equals("220V")) {
            System.out.println("Adapter: Converting the voltage...");
            volts = "110V";
            System.out.println("Adapter: Output of the Adapter is " + volts);
        } else if(volts.equals("110V")){
            System.out.println("Adapter: Output of the Adapter is " + volts);
        } else {
            resp = "Adapter: Cannot  be connected. Out of the range";
            resp += "Incompatible Voltage: " + volts;
            return resp;
        }
        resp = computer.connectComputer(volts);
        return resp;
    }
}
