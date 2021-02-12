package Design_Pattern.Pattern_2_Observer.Observer.Observer;

// 所有观察者都必须实现update()方法，以实现观察者接口。在这将观测值传入观察者中
public interface Observer {
    //
    public void update(float temperature, float humidity, float pressure);
}
