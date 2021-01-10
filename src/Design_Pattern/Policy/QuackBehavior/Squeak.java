package Design_Pattern.Policy.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("I'm speaking!!");
    }
}
