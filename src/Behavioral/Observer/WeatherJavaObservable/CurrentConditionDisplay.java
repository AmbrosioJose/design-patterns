package Behavioral.Observer.WeatherJavaObservable;


import java.util.Observable;
import java.util.Observer;

/**
 * CurrentConditionDisplay observes the WeatherData Subject.
 * <p>
 * Displays the most recent temperature and humidity;
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Observable observable;

    public CurrentConditionDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable obs, Object arg){
        if(obs instanceof WeatherData weatherData){
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display(){
        System.out.println("Current conditions: " + temperature + " F degrees and " + humidity + "% humidity");
    }
}
