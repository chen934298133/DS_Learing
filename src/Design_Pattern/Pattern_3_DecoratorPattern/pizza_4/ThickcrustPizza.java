package Design_Pattern.Pattern_3_DecoratorPattern.pizza_4;

public class ThickcrustPizza extends Pizza {
  
	public ThickcrustPizza() {
		description = "Thick crust pizza, with tomato sauce";
	}
  
	public double cost() {
		return 7.99;
	}
}

