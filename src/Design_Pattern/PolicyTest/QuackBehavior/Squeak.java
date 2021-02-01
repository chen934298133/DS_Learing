package Design_Pattern.PolicyTest.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("I'm speaking!!");
    }
}
