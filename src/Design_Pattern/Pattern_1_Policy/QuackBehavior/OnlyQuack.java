package Design_Pattern.Pattern_1_Policy.QuackBehavior;

public class OnlyQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("I'm Quacking!!");
    }
}
