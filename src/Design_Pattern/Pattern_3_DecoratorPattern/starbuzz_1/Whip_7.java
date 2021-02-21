package Design_Pattern.Pattern_3_DecoratorPattern.starbuzz_1;

public class Whip_7 extends CondimentDecorator_2 {

    Beverage_1 beverage_1;

    public Whip_7(Beverage_1 beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Whip_7";
    }

    public double cost() {
        return .10 + beverage.cost();
    }
}
