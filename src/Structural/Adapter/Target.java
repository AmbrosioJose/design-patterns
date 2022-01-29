package Structural.Adapter;

/**
 * This interface helps in creating an adapter that converts from input volt  to output volt.
 * The voltage Adapter() method receives the input volts from socket and returns an output volt that is required by the computer.
 */
public interface Target {
    public String connectAdapter(String volt);
}
