package Design_Pattern.Pattern_2_Observer.N3_weather.WeatherStation;

import Design_Pattern.Pattern_2_Observer.N3_weather.Observer_Display.ForecastDisplay;
import Design_Pattern.Pattern_2_Observer.N3_weather.Observer_Display.HeatIndexDisplay;
import Design_Pattern.Pattern_2_Observer.N3_weather.Observer_Display.CurrentConditionsDisplay;
import Design_Pattern.Pattern_2_Observer.N3_weather.Observer_Display.StatisticsDisplay;
import Design_Pattern.Pattern_2_Observer.N3_weather.Subject.Subject_WeatherData;

public class WeatherStationHeatIndex {

	public static void main(String[] args) {
		Subject_WeatherData subjectWeatherData = new Subject_WeatherData();
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(subjectWeatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(subjectWeatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(subjectWeatherData);
		HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(subjectWeatherData);

		subjectWeatherData.setMeasurements(80, 65, 30.4f);
		subjectWeatherData.setMeasurements(82, 70, 29.2f);
		subjectWeatherData.setMeasurements(78, 90, 29.2f);
	}
}
