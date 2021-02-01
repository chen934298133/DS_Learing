package Design_Pattern.PolicyTest.Duck;

import Design_Pattern.PolicyTest.Flybehavior.FlyWithWings;
import Design_Pattern.PolicyTest.QuackBehavior.OnlyQuack;

public class MallardDuck extends Duck {

    public MallardDuck(){
        quackBehavior = new OnlyQuack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard Duck!");
    }
}
