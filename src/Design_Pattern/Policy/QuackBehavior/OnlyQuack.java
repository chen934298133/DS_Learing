package Design_Pattern.Policy.QuackBehavior;

public class OnlyQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("I'm Quacking!!");
    }
}
