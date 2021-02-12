package Design_Pattern.Pattern_2_Observer.N3_weather.WeatherStation;

import Design_Pattern.Pattern_2_Observer.N3_weather.Observer_Display.ForecastDisplay;
import Design_Pattern.Pattern_2_Observer.N3_weather.Observer_Display.CurrentConditionsDisplay;
import Design_Pattern.Pattern_2_Observer.N3_weather.Observer_Display.StatisticsDisplay;
import Design_Pattern.Pattern_2_Observer.N3_weather.Subject.Subject_WeatherData;

public class WeatherStation {

	public static void main(String[] args) {
		// 获取主题的天气信息对象，以便setMeasurements新信息
		Subject_WeatherData WeatherData = new Subject_WeatherData();
		// '观察者1'获取当前温度湿度
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(WeatherData);
		// '观察者2'统计当前平均温度、最高最低温度
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(WeatherData);
		// '观察者3'根据压力值，预测天气并展示
		ForecastDisplay forecastDisplay = new ForecastDisplay(WeatherData);

		WeatherData.setMeasurements(80, 65, 30.4f);
		System.out.println();

		WeatherData.setMeasurements(82, 70, 29.2f);
		System.out.println();

		WeatherData.setMeasurements(78, 90, 29.2f);
		System.out.println();

		// 移除'观察者3',取消预测
		WeatherData.removeObserver(forecastDisplay);
		WeatherData.setMeasurements(62, 90, 28.1f);
	}
}
