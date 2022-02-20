package Behavioral.Observer.WeatherJavaObservable;

import java.util.Observable;
import java.util.Observer;

/**
 * The Statistic Display observes the WeatherData Subject.
 * <p>
 * Displays an average, min and max of the temperature data that this DisplayElement has received so far
 */
public class StatisticsDisplay implements Observer, DisplayElement {
    private float maxTemp = 0.0f;
    private float minTemp = 0.0f;
    private float tempSum = 0.0f;
    private int numReadings;
    private Observable observable;

    /**
     * Instantiates a new Statistics display.
     *
     * @param observable the weather data
     */
    public StatisticsDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable obs, Object obj){
        if(obs instanceof WeatherData weatherData){
            tempSum += weatherData.getTemperature();
            numReadings++;

            if(weatherData.getTemperature() > maxTemp){
                maxTemp = weatherData.getTemperature();
            }

            if(weatherData.getTemperature() < minTemp){
                minTemp = weatherData.getTemperature();
            }
            display();
        }
    }

    @Override
    public void display(){
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings) + "/" + maxTemp + "/" + minTemp);
    }
}
