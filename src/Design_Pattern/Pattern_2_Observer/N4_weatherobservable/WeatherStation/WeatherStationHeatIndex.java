package Design_Pattern.Pattern_2_Observer.N4_weatherobservable.WeatherStation;

import Design_Pattern.Pattern_2_Observer.N4_weatherobservable.Observer_Display.CurrentConditionsDisplay;
import Design_Pattern.Pattern_2_Observer.N4_weatherobservable.Observer_Display.ForecastDisplay;
import Design_Pattern.Pattern_2_Observer.N4_weatherobservable.Observer_Display.HeatIndexDisplay;
import Design_Pattern.Pattern_2_Observer.N4_weatherobservable.Observer_Display.StatisticsDisplay;
import Design_Pattern.Pattern_2_Observer.N4_weatherobservable.Subject.WeatherData;

public class WeatherStationHeatIndex {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentConditions = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}
}
