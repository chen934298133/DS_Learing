package Design_Pattern.Pattern_2_Observer.N4_weatherobservable.Observer_Display;

import Design_Pattern.Pattern_2_Observer.N4_weatherobservable.DisplayElement.DisplayElement;
import Design_Pattern.Pattern_2_Observer.N4_weatherobservable.Subject.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElement {
	private float currentPressure = 29.92f;  
	private float lastPressure;

	public ForecastDisplay(Observable observable) {
		observable.addObserver(this);
	}

	public void update(Observable observable, Object arg) {
		if (observable instanceof WeatherData) {
			WeatherData weatherData = (WeatherData)observable;
			lastPressure = currentPressure;
			currentPressure = weatherData.getPressure();
			display();
		}
	}

	public void display() {
		System.out.print("Forecast: ");
		if (currentPressure > lastPressure) {
			System.out.println("Improving weather on the way!");
		} else if (currentPressure == lastPressure) {
			System.out.println("More of the same");
		} else if (currentPressure < lastPressure) {
			System.out.println("Watch out for cooler, rainy weather");
		}
	}
}
