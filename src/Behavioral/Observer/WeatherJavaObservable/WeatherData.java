package Behavioral.Observer.WeatherJavaObservable;

import java.util.Observable;

/**
 * The WeatherData class extends the Observable class. We are using PULL method
 *
 * Notice that we don't need to keep track of the observers anymore or manage their registration and removal since the
 * superclass handles it. We also removed registerObserver(), removeObserver(), and notifyObserver() methods.
 *
 *
 *
 * "Tracks current weather conditions" (temperature, humidity, and barometric pressure)
 * The WeatherData object updates the registered observers(DisplayElements in this case) with the three key weather
 * conditions.
 */
public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    /**
     * Instantiates a new Weather data.
     */
    WeatherData(){}

    /**
     * Get temperature.
     */
    public float getTemperature(){
        return temperature;
    }

    /**
     * Get humidity.
     */
    public float getHumidity(){
        return humidity;
    }

    /**
     * Get pressure.
     */
    public float getPressure(){
        return pressure;
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
        setChanged();
        notifyObservers();
    }


}
