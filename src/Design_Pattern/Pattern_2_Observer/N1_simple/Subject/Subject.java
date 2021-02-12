package Design_Pattern.Pattern_2_Observer.N1_simple.Subject;

import Design_Pattern.Pattern_2_Observer.N1_simple.Observer.Observer;

public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
}
