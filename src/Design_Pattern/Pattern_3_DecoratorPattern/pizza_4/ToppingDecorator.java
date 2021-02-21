package Design_Pattern.Pattern_3_DecoratorPattern.pizza_4;

public abstract class ToppingDecorator extends Pizza {
	Pizza pizza;
	public abstract String getDescription();
}
