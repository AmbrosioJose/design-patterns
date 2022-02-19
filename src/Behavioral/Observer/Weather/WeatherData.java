package Behavioral.Observer.Weather;

import java.util.ArrayList;

/**
 * The WeatherData class implements the Subject interface
 *
 * "Tracks current weather conditions" (temperature, humidity, and barometric pressure)
 * The WeatherData object updates the registered observers(DisplayElements in this case) with the three key weather
 * conditions.
 */
public class WeatherData implements Subject{
    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    /**
     * Instantiates a new Weather data.
     */
    WeatherData(){
        observers = new ArrayList<Observer>();
    }

    /**
     * Get temperature.
     */
    public void getTemperature(){

    }

    /**
     * Get humidity.
     */
    public void getHumidity(){

    }

    /**
     * Get pressure.
     */
    public void getPressure(){

    }

    @Override
    public void registerObserver(Observer observer){
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(){
        for(Observer observer: observers){
            observer.update(temperature, humidity, pressure);
        }
    }

    /**
     * Set measurements.
     *
     * @param temperature the temperature
     * @param humidity    the humidity
     * @param pressure    the pressure
     */
    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    /**
     * Measurements changed.
     */
    public void measurementsChanged(){
        notifyObservers();
    }


}
