package Design_Pattern.Pattern_1_Policy.Duck;

import Design_Pattern.Pattern_1_Policy.Flybehavior.FlyNoWay;
import Design_Pattern.Pattern_1_Policy.QuackBehavior.OnlyQuack;

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
