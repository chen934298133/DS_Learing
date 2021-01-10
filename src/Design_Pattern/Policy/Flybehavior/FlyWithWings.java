package Design_Pattern.Policy.Flybehavior;

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I'm flying!!");
    }
}
