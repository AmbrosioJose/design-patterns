package Behavioral.Observer.Weather;

/**
 * Heat Index display that observes WeatherData
 *
 * The heat index is an index that combines the temperature and humidity to determine the apparent temperature (how hot
 * it actually feels)
 */
public class HeatIndexDisplay implements Observer, DisplayElement{
    private float temperature;
    private float humidity;
    private float heatIndex;
    private WeatherData weatherData;

    /**
     * Instantiates a new Heat index display.
     *
     * @param weatherData the weather data
     */
    public HeatIndexDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display(){
        heatIndex = computeHeatIndex(temperature, humidity);
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
