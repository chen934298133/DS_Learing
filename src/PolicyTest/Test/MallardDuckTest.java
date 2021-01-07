package PolicyTest.Test;

import PolicyTest.Duck.Duck;
import PolicyTest.Duck.MallardDuck;

public class MallardDuckTest {
    public static void main(String[] args) {
        Duck duck1 = new MallardDuck();
        duck1.display();
        duck1.performFly();
        duck1.performQuack();
        duck1.swim();
    }
}
