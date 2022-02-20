package Behavioral.Observer.WeatherJavaObservable;

import Behavioral.Observer.WeatherJavaObservable.WeatherData;

import java.util.Observable;
import java.util.Observer;

/**
 * ForecastDisplay display that observes WeatherData. By implementing the Observer interface
 *
 * The Forecast display gives a slight hint of what is to come(supposedly).
 */
public class ForecastDisplay implements Observer, DisplayElement {
    private float currentPressure = 29.9f;
    private float lastPressure;
    private Observable observable;

    public ForecastDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable obs, Object arg){
        if(obs instanceof WeatherData weatherData){
            lastPressure = currentPressure;
            currentPressure = weatherData.getPressure();
            display();
        }

    }

    @Override
    public void display() {
        System.out.print("Forecast: ");
        if(currentPressure > lastPressure){
            System.out.println("Improving weather on the way!");
        } else if(currentPressure == lastPressure){
            System.out.println("More of the same");
        } else if(currentPressure < lastPressure) {
            System.out.println("Forecast: Watch out for cooler, rainy weather");
        }
    }
}
