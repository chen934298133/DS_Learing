package Design_Pattern.Pattern_3_DecoratorPattern.starbuzz_1;

public class Espresso_3 extends Beverage_1{

    public Espresso_3(){
        description = "Espresso";
//        this.setDescription("Espresso");
    }

    public double cost() {
        return 1.99;
    }
}
