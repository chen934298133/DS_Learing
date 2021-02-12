package Design_Pattern.Pattern_1_Policy.Flybehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly.");
    }
}
