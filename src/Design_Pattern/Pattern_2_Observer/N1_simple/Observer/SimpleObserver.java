package Design_Pattern.Pattern_2_Observer.N1_simple.Observer;

import Design_Pattern.Pattern_2_Observer.N1_simple.Subject.Subject;

/**
 * 继承Observer接口 实现update方法
 * 添加display方法
  */
public class SimpleObserver implements Observer {
	private int value;
	private Subject simpleSubject;

	public SimpleObserver(Subject simpleSubject) {
		this.simpleSubject = simpleSubject;
		simpleSubject.registerObserver(this);
	}

	@Override
	public void update(int value) {
		this.value = value;
		display();
	}
	
	public void display() {
		System.out.println("Value: " + value);
	}
}
