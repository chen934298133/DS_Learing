package Design_Pattern.Pattern_2_Observer.Observer.Subject;

import Design_Pattern.Pattern_2_Observer.Observer.Observer.Observer;
import java.util.ArrayList;

// 实现Subject方法
public class Subject_WeatherData implements Subject {

    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    // 在构造器中建立ArrayList，记录观察者
    public Subject_WeatherData(){
        observers = new ArrayList();
    }

    // 当注册观察者时，即加入ArrayList后。
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    // 观察者取消注册，即从ArrayList移除。
    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i > 0){
            observers.remove(i);
        }
    }

    // 把状态告诉每一个观察者
    @Override
    public void notifyObserver() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(temperature, humidity, pressure);

        }
    }

    // 当从气象站得到更新观测值时，通知观察者。
    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObserver();
    }
}
