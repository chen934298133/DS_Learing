package Design_Pattern.Pattern_2_Observer.N1_simple;

import Design_Pattern.Pattern_2_Observer.N1_simple.Observer.SimpleObserver;
import Design_Pattern.Pattern_2_Observer.N1_simple.Subject.SimpleSubject;

public class Test {

	public static void main(String[] args) {

		SimpleSubject simpleSubject = new SimpleSubject();
		SimpleObserver simpleObserver = new SimpleObserver(simpleSubject);

		simpleSubject.setValue(80);
		
//		simpleSubject.removeObserver(simpleObserver);
	}
}
