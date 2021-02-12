package Design_Pattern.Pattern_2_Observer.N3_weather.Observer_Display;

import Design_Pattern.Pattern_2_Observer.N3_weather.DisplayElement.DisplayElement;
import Design_Pattern.Pattern_2_Observer.N3_weather.Observer.Observer;
import Design_Pattern.Pattern_2_Observer.N3_weather.Subject.Subject_WeatherData;

// 统计并展示平均温度，最高温度、最低温度
public class StatisticsDisplay implements Observer, DisplayElement {
	private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum= 0.0f;
	private int numReadings;
	private Subject_WeatherData subjectWeatherData;

	public StatisticsDisplay(Subject_WeatherData subjectWeatherData) {
		this.subjectWeatherData = subjectWeatherData;
		subjectWeatherData.registerObserver(this);
	}

	public void update(float temp, float humidity, float pressure) {
		tempSum += temp;
		numReadings++;

		if (temp > maxTemp) {
			maxTemp = temp;
		}
 
		if (temp < minTemp) {
			minTemp = temp;
		}

		display();
	}

	public void display() {
		System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings) + "/" + maxTemp + "/" + minTemp);
	}
}
