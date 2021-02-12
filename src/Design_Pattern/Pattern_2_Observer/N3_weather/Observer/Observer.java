package Design_Pattern.Pattern_2_Observer.N3_weather.Observer;

// 所有'观察者'需要implements此接口，实现update方法以便获取信息
public interface Observer {
	public void update(float temp, float humidity, float pressure);
}
