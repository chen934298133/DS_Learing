package Design_Pattern.FactoryMethod.A4_AbstractFactory.PizzaStore;


import Design_Pattern.FactoryMethod.A4_AbstractFactory.Pizza.CheesePizza;
import Design_Pattern.FactoryMethod.A4_AbstractFactory.Pizza.Pizza;
import Design_Pattern.FactoryMethod.A4_AbstractFactory.PizzaIngredientFactory.NYPizzaIngredientFactory;
import Design_Pattern.FactoryMethod.A4_AbstractFactory.PizzaIngredientFactory.PizzaIngredientFactory;

public class NYPizzaStore extends PizzaStore{

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();//********************************

        if (type.equals("cheese")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        }else if (type.equals("greek")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Greek Pizza");
        }

        return pizza;
    }
}
