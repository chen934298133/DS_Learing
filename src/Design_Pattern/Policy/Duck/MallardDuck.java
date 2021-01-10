package Design_Pattern.Policy.Duck;

import Design_Pattern.Policy.Flybehavior.FlyWithWings;
import Design_Pattern.Policy.QuackBehavior.OnlyQuack;

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
