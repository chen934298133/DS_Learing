package Design_Pattern.Pattern_3_DecoratorPattern.starbuzzWithSizes_2;

public class DarkRoast extends Beverage {
	public DarkRoast() {
		description = "Dark Roast Coffee";
	}
 
	public double cost() {
		return .99;
	}
}

