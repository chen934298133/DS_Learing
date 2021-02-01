package Design_Pattern.PolicyTest.Test;

import Design_Pattern.PolicyTest.Duck.Duck;
import Design_Pattern.PolicyTest.Flybehavior.FlyRocketPowered;
import Design_Pattern.PolicyTest.Duck.ModelDuck;

//用户只知道display、performFly、performQuack、swim、setFlyBehavior、setQuackBehavior几个操作。
//需要改动需求的时候，仅需要在对应的FlyBehavior或QuackBehavior中添加表现，然后在测试中set即可
public class ModelDuckTest {
    public static void main(String[] args) {
        Duck duck2 = new ModelDuck();
        duck2.display();
        duck2.performFly();
        duck2.performQuack();
        duck2.swim();
        duck2.setFlyBehavior(new FlyRocketPowered());
        duck2.performFly();
    }
}
