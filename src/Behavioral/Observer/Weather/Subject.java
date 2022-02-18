package Behavioral.Observer.Weather;

/**
 * The interface Subject.
 */
public interface Subject {

    /**
     * Register observer.
     *
     * @param observer the observer
     */
    public void registerObserver(Observer observer);

    /**
     * Remove observer.
     *
     * @param observer the observer
     */
    public void removeObserver(Observer observer);

    /**
     * Notifies all observers when the Subject's state has changed
     */
    public void notifyObserver();

}
