package Design_Pattern.Pattern_3_DecoratorPattern.starbuzzWithSizes_2;
 
public class Whip extends CondimentDecorator {
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
 
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}
 
	public double cost() {
		return beverage.cost() + .10;
	}
}
