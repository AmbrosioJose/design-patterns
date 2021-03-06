package Behavioral.Observer.Weather;

/**
 * CurrentConditionDisplay observes the WeatherData Subject.
 * <p>
 * Displays the most recent temperature and humidity;
 */
public class CurrentConditionDisplay implements Observer, DisplayElement{
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData){
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure){
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display(){
        System.out.println("Current conditions: " + temperature + " F degrees and " + humidity + "% humidity");
    }
}
