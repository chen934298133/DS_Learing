package Design_Pattern.Pattern_3_DecoratorPattern.starbuzz_1;

public class Decaf extends Beverage_1 {
    public Decaf() {
        description = "Decaf Coffee";
    }

    public double cost() {
        return 1.05;
    }
}
