package Design_Pattern.Pattern_2_Observer.N2_simple_Observable;

/**
 * 实现 API 中 Observer 接口 “update(Observable o, Object arg)”
 * 继承 API 中 Observable 类
 */
public class Test {

	public static void main(String[] args) {
		SimpleSubject simpleSubject = new SimpleSubject();
		SimpleObserver simpleObserver = new SimpleObserver(simpleSubject);

		simpleSubject.setValue(80);
	}
}
