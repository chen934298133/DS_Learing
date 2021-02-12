package Design_Pattern.Pattern_2_Observer.Observer.Subject;

import Design_Pattern.Pattern_2_Observer.Observer.Observer.Observer;

public interface Subject {
    // 两个方法都需要一个观察者作为变量，该观察市用来注册或者被删除的
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    // 当主题改变时，此方法被调用，通知所有观察者
    public void notifyObserver();
}

