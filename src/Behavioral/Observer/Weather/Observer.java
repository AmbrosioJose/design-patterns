package Behavioral.Observer.Weather;


/**
 * The interface Observer.
 *
 *  All our weather components implement the Observer interface. This gives the Subject a common interface
 *  to talk to when it comes time to update the observer.
 */
public interface Observer {


    /**
     * State values that the observer gets from the Subject when a weather measurement changes
     *
     * @param temp     the temp
     * @param humidity the humidity
     * @param pressure the pressure
     */
    public void update(float temp, float humidity, float pressure);
}
