package Design_Pattern.Pattern_2_Observer.N3_weather.Observer_Display;

import Design_Pattern.Pattern_2_Observer.N3_weather.DisplayElement.DisplayElement;
import Design_Pattern.Pattern_2_Observer.N3_weather.Observer.Observer;
import Design_Pattern.Pattern_2_Observer.N3_weather.Subject.Subject_WeatherData;

// '观察者1'需要获取当前温度、湿度信息
public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private float temperature;
	private float humidity;
	private Subject_WeatherData WeatherData;
	
	public CurrentConditionsDisplay(Subject_WeatherData WeatherData) {
		this.WeatherData = WeatherData;
		WeatherData.registerObserver(this);
	}
	
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}
	
	public void display() {
		System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
	}
}
