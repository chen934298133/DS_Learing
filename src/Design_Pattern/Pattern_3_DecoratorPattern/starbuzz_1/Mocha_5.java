package Design_Pattern.Pattern_3_DecoratorPattern.starbuzz_1;

public class Mocha_5 extends CondimentDecorator_2 {

    public Mocha_5(Beverage_1 beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public double cost() {
        return .20 + beverage.cost();
    }
}
