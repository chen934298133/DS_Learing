package Design_Pattern.Pattern_2_Observer.N3_weather.Subject;

import Design_Pattern.Pattern_2_Observer.N3_weather.Observer.Observer;

public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
}
