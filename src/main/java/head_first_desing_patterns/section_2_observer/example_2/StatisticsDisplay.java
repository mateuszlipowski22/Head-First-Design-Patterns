package head_first_desing_patterns.section_2_observer.example_2;

import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer, DisplayElement {
	private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum= 0.0f;
	private int numReadings;
	private WeatherData weatherData;

	public StatisticsDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.addObserver(this);
	}

	public void update(Observable observable, Object arg) {
		if(observable instanceof WeatherData){
			WeatherData weatherData = (WeatherData) observable;
			tempSum += weatherData.getTemperature();
			numReadings++;

			if (weatherData.getTemperature() > maxTemp) {
				maxTemp = weatherData.getTemperature();
			}

			if (weatherData.getTemperature() < minTemp) {
				minTemp = weatherData.getTemperature();
			}

			display();
		}

	}

	public void display() {
		System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
			+ "/" + maxTemp + "/" + minTemp);
	}
}
