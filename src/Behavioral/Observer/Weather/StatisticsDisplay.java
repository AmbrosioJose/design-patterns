package Behavioral.Observer.Weather;

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
    private WeatherData weatherData;

    /**
     * Instantiates a new Statistics display.
     *
     * @param weatherData the weather data
     */
    public StatisticsDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure){
        tempSum += temp;
        numReadings++;

        if(temp > maxTemp){
            maxTemp = temp;
        }

        if(temp < minTemp){
            minTemp = temp;
        }
        display();
    }

    @Override
    public void display(){
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings) + "/" + maxTemp + "/" + minTemp);
    }
}
