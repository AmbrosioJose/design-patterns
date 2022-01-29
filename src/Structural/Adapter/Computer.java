package Structural.Adapter;


/**
 * Can work only at 110V
 */
public class Computer {

    public String connectComputer(String volts){
        System.out.println("Computer: Received from Adapter " + volts);
        if(volts.equals("110V")){
          return "Computer: connected to the power source";
        }
        return "Computer: not connected to power source";
    }
}
