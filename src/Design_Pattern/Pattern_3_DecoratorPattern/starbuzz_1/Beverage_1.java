package Design_Pattern.Pattern_3_DecoratorPattern.starbuzz_1;

public abstract class Beverage_1 {

    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

//    public void setDescription(String description) {
//        this.description = description;
//    }

    public abstract double cost();
}
