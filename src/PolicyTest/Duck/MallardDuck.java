package PolicyTest.Duck;

import PolicyTest.Flybehavior.FlyWithWings;
import PolicyTest.QuackBehavior.OnlyQuack;

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
