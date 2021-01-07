package PolicyTest.Duck;

import PolicyTest.Flybehavior.FlyNoWay;
import PolicyTest.QuackBehavior.OnlyQuack;

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
