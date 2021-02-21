package Design_Pattern.Pattern_3_DecoratorPattern.starbuzz_1;

public class DarkRoast extends Beverage_1 {
    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    public double cost() {
        return .99;
    }
}
