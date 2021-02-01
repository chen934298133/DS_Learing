package Design_Pattern.PolicyTest.Duck;

import Design_Pattern.PolicyTest.Flybehavior.FlyNoWay;
import Design_Pattern.PolicyTest.QuackBehavior.OnlyQuack;

public class ModelDuck extends Duck{

    public ModelDuck(){
        quackBehavior = new OnlyQuack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Model Duck.");
    }
}
