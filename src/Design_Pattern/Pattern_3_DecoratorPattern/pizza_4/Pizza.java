package Design_Pattern.Pattern_3_DecoratorPattern.pizza_4;

public abstract class Pizza {
	String description = "Basic Pizza";
  
	public String getDescription() {
		return description;
	}
 
	public abstract double cost();
}
