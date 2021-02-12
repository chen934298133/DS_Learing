package Design_Pattern.Pattern_2_Observer.Observer.WeatherStation;

import Design_Pattern.Pattern_2_Observer.Observer.Observer_Display.HeatIndexDisplay;
import Design_Pattern.Pattern_2_Observer.Observer.Subject.Subject;
import Design_Pattern.Pattern_2_Observer.Observer.Subject.Subject_WeatherData;
import Design_Pattern.Pattern_2_Observer.Observer.Observer_Display.CurrentConditionsDisplay;

public class WeatherStation {
    public static void main(String[] args){
        // 主题对象
        Subject_WeatherData weatherData = new Subject_WeatherData();
        // 观察者对象
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        System.out.println();
        weatherData.setMeasurements(82, 70, 29.2f);
        System.out.println();
        weatherData.setMeasurements(78, 90, 29.2f);


    }
}
