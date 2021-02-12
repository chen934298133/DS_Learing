package Design_Pattern.Pattern_1_Policy.Test;

import Design_Pattern.Pattern_1_Policy.Duck.Duck;
import Design_Pattern.Pattern_1_Policy.Duck.MallardDuck;

public class MallardDuckTest {
    public static void main(String[] args) {
        Duck duck1 = new MallardDuck();
        duck1.display();
        duck1.performFly();
        duck1.performQuack();
        duck1.swim();
    }
}
