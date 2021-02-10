package Design_Pattern.Observer.display;

import Design_Pattern.Observer.DisplayElement.DisplayElement;
import Design_Pattern.Observer.Observer.Observer;
import Design_Pattern.Observer.Subject.Subject;

// 实现Observer接口，从WeatherData中获得改变
// 同时实现DisplayElement接口，因为我们API规定所有的布告板都必须实现此接口
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    // 构造器需要weatherData对象(即主题)，作为注册使用
    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        // 保存温度和湿度，并调用display
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        // 仅显示温度和湿度
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }
}
