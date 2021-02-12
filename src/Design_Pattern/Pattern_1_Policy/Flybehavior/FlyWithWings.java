package Design_Pattern.Pattern_1_Policy.Flybehavior;

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I'm flying!!");
    }
}
