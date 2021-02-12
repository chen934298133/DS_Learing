package Design_Pattern.Pattern_1_Policy.Duck;

import Design_Pattern.Pattern_1_Policy.Flybehavior.FlyWithWings;
import Design_Pattern.Pattern_1_Policy.QuackBehavior.OnlyQuack;

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
