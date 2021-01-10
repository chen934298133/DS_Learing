package Design_Pattern.Policy.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("I can't speak.");
    }
}
