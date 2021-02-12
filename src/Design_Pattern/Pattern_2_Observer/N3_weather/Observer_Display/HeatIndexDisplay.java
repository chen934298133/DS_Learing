package Design_Pattern.Pattern_2_Observer.N3_weather.Observer_Display;

import Design_Pattern.Pattern_2_Observer.N3_weather.DisplayElement.DisplayElement;
import Design_Pattern.Pattern_2_Observer.N3_weather.Observer.Observer;
import Design_Pattern.Pattern_2_Observer.N3_weather.Subject.Subject_WeatherData;

// '观察者3'获取温度与湿度计算出'酷热指数'，并展示'酷热指数'
public class HeatIndexDisplay implements Observer, DisplayElement {
	float heatIndex = 0.0f;
	private Subject_WeatherData subjectWeatherData;

	public HeatIndexDisplay(Subject_WeatherData subjectWeatherData) {
		this.subjectWeatherData = subjectWeatherData;
		subjectWeatherData.registerObserver(this);
	}

	public void update(float t, float rh, float pressure) {
		heatIndex = computeHeatIndex(t, rh);
		display();
	}
	
	private float computeHeatIndex(float t, float rh) {
		float index = (float)((16.923 + (0.185212 * t) + (5.37941 * rh) - (0.100254 * t * rh) 
			+ (0.00941695 * (t * t)) + (0.00728898 * (rh * rh)) 
			+ (0.000345372 * (t * t * rh)) - (0.000814971 * (t * rh * rh)) +
			(0.0000102102 * (t * t * rh * rh)) - (0.000038646 * (t * t * t)) + (0.0000291583 * 
			(rh * rh * rh)) + (0.00000142721 * (t * t * t * rh)) + 
			(0.000000197483 * (t * rh * rh * rh)) - (0.0000000218429 * (t * t * t * rh * rh)) +
			0.000000000843296 * (t * t * rh * rh * rh)) -
			(0.0000000000481975 * (t * t * t * rh * rh * rh)));
		return index;
	}

	public void display() {
		System.out.println("Heat index is " + heatIndex);
	}
}
