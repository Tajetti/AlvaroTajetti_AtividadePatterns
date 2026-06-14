package br.alvaro.observerComportamental;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation {
    private final List<TemperatureObserver> observers = new ArrayList<>();
    private double temperature;

    public void subscribe(TemperatureObserver observer) {
        observers.add(observer);
    }

    public void unsubscribe(TemperatureObserver observer) {
        observers.remove(observer);
    }

    public void setTemperature(double temp) {
        temperature = temp;
        notifyObservers();
    }

    private void notifyObservers() {
        for (TemperatureObserver observer : observers) {
            observer.onTemperatureChanged(temperature);
        }
    }
}
