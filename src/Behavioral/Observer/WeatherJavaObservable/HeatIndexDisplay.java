package Behavioral.Observer.WeatherJavaObservable;

import Behavioral.Observer.WeatherJavaObservable.WeatherData;

import java.util.Observable;
import java.util.Observer;

/**
 * Heat Index display that observes WeatherData
 *
 * The heat index is an index that combines the temperature and humidity to determine the apparent temperature (how hot
 * it actually feels)
 */
public class HeatIndexDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Observable observable;

    /**
     * Instantiates a new Heat index display.
     *
     * @param observable the weather data
     */
    public HeatIndexDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable obs, Object args){
        if(obs instanceof WeatherData){
            WeatherData weatherData = (WeatherData) obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }

    }

    @Override
    public void display(){
        float heatIndex = computeHeatIndex(temperature, humidity);
        System.out.println("Heat index is " + heatIndex);
    }

    private float computeHeatIndex(float t, float rh) {
        return (float)((16.923 + (0.185212 * t) + (5.37941 * rh) - (0.100254 * t * rh) +
                (0.00941695 * (t * t)) + (0.00728898 * (rh * rh)) +
                (0.000345372 * (t * t * rh)) - (0.000814971 * (t * rh * rh)) +
                (0.0000102102 * (t * t * rh * rh)) - (0.000038646 * (t * t * t)) + (0.0000291583 *
                (rh * rh * rh)) + (0.00000142721 * (t * t * t * rh)) +
                (0.000000197483 * (t * rh * rh * rh)) - (0.0000000218429 * (t * t * t * rh * rh)) +
                0.000000000843296 * (t * t * rh * rh * rh)) -
                (0.0000000000481975 * (t * t * t * rh * rh * rh)));
    }

}
