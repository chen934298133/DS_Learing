package Design_Pattern.Pattern_3_DecoratorPattern.starbuzzWithSizes_2;

public abstract class Beverage {
	public enum Size { TALL, GRANDE, VENTI };
	Size size = Size.TALL;
	String description = "Unknown Beverage";
  
	public String getDescription() {
		return description;
	}
	
	public void setSize(Size size) {
		this.size = size;
	}
	
	public Size getSize() {
		return this.size;
	}
 
	public abstract double cost();
}
