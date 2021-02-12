package Design_Pattern.Pattern_2_Observer.N3_weather.Observer_Display;

import Design_Pattern.Pattern_2_Observer.N3_weather.DisplayElement.DisplayElement;
import Design_Pattern.Pattern_2_Observer.N3_weather.Observer.Observer;
import Design_Pattern.Pattern_2_Observer.N3_weather.Subject.Subject_WeatherData;

// '观察者2'
public class ForecastDisplay implements Observer, DisplayElement {
	private float currentPressure = 29.92f;  
	private float lastPressure;
	private Subject_WeatherData subjectWeatherData;

	public ForecastDisplay(Subject_WeatherData subjectWeatherData) {
		this.subjectWeatherData = subjectWeatherData;
		subjectWeatherData.registerObserver(this);
	}

	// 更新'压力'，并展示预报结果
	public void update(float temp, float humidity, float pressure) { // 温度，湿度，压力
        lastPressure = currentPressure;
		currentPressure = pressure;
		display();
	}


	public void display() {
		System.out.print("Forecast: ");
		if (currentPressure > lastPressure) {
			// 天气转好
			System.out.println("Improving weather on the way!");
		} else if (currentPressure == lastPressure) {
			System.out.println("More of the same");
		} else if (currentPressure < lastPressure) {
			// 天气变差
			System.out.println("Watch out for cooler, rainy weather");
		}
	}
}
