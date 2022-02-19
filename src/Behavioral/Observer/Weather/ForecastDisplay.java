package Behavioral.Observer.Weather;

/**
 * ForecastDisplay display that observes WeatherData
 *
 * The Forecast display gives a slight hint of what is to come(supposedly).
 */
public class ForecastDisplay implements Observer, DisplayElement{
    private float currentPressure = 29.9f;
    private float lastPressure;
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure){
        lastPressure = currentPressure;
        currentPressure = pressure;

        display();
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
