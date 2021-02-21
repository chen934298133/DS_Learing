package Design_Pattern.Pattern_3_DecoratorPattern.pizza_4;

public class Olives extends ToppingDecorator {
	
 
	public Olives(Pizza pizza) {
		this.pizza = pizza;
	}
 
	public String getDescription() {
		return pizza.getDescription() + ", Olives";
	}
 
	public double cost() {
		return pizza.cost() + .30; 
	}
}
