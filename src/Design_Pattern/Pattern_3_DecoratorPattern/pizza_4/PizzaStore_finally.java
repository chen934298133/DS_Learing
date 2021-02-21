package Design_Pattern.Pattern_3_DecoratorPattern.pizza_4;

// 为下一个工厂模式铺垫
public class PizzaStore_finally {
 
	public static void main(String args[]) {
		Pizza pizza = new ThincrustPizza();
		Pizza cheesePizza = new Cheese(pizza);
		Pizza greekPizza = new Olives(cheesePizza);

		System.out.println(greekPizza.getDescription() + " $" + greekPizza.cost());

	}
}
