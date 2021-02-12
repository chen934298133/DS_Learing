package Design_Pattern.Pattern_2_Observer.N1_simple.Subject;

import Design_Pattern.Pattern_2_Observer.N1_simple.Observer.Observer;
import java.util.ArrayList;

/**
 * 实现Subject方法
 * 新建List保存observer列表
 * 设置setValue
  */
public class SimpleSubject implements Subject {
	private ArrayList<Observer> observers;
	private int value = 0;
	
	public SimpleSubject() {
		observers = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
		System.out.println("Added successfully!");
	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
		System.out.println("Removed successfully!");
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(value);
		}
	}
	
	public void setValue(int value) {
		this.value = value;
		notifyObservers();
	}
}