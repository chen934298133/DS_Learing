package Design_Pattern.PolicyTest.Test;

import Design_Pattern.PolicyTest.Duck.Duck;
import Design_Pattern.PolicyTest.Duck.MallardDuck;

public class MallardDuckTest {
    public static void main(String[] args) {
        Duck duck1 = new MallardDuck();
        duck1.display();
        duck1.performFly();
        duck1.performQuack();
        duck1.swim();
    }
}
