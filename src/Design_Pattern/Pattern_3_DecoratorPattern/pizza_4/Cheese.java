package Design_Pattern.Pattern_3_DecoratorPattern.pizza_4;

public class Cheese extends ToppingDecorator {
	
 
	public Cheese(Pizza pizza) {
		this.pizza = pizza;
	}
 
	public String getDescription() {
		return pizza.getDescription() + ", Cheese";
	}
 
	public double cost() {
		return pizza.cost(); // cheese is free
	}
}
