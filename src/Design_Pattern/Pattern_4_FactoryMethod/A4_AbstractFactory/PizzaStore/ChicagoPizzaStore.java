package Design_Pattern.Pattern_4_FactoryMethod.A4_AbstractFactory.PizzaStore;

import Design_Pattern.Pattern_4_FactoryMethod.A4_AbstractFactory.Pizza.CheesePizza;
import Design_Pattern.Pattern_4_FactoryMethod.A4_AbstractFactory.Pizza.Pizza;
import Design_Pattern.Pattern_4_FactoryMethod.A4_AbstractFactory.PizzaIngredientFactory.ChicagoPizzaIngredientFactory;
import Design_Pattern.Pattern_4_FactoryMethod.A4_AbstractFactory.PizzaIngredientFactory.PizzaIngredientFactory;

public class ChicagoPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();//*************************************

        if (type.equals("cheese")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        }else if (type.equals("greek")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Greek Pizza");
        }

        return pizza;
    }
}
