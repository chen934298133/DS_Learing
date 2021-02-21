package Design_Pattern.Pattern_3_DecoratorPattern.starbuzz_1;

public class Soy_6 extends CondimentDecorator_2 {

    public Soy_6(Beverage_1 beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    public double cost() {
        return .15 + beverage.cost();
    }
}

