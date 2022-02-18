package Behavioral.Observer.Weather;

import java.util.ArrayList;

public class WeatherData implements Subject{
    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    WeatherData(){
        observers = new ArrayList<Observer>();
    }

    public void getTemperature(){

    }

    public void getHumidity(){

    }

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
    public void notifyObserver(){
        for(Observer observer: observers){
            observer.update(temperature, humidity, pressure);
        }
    }


}
