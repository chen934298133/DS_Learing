package Design_Pattern.FactoryMethod.A4_AbstractFactory.PizzaIngredientFactory;

import Design_Pattern.FactoryMethod.A4_AbstractFactory.Ingredient.Cheese;
import Design_Pattern.FactoryMethod.A4_AbstractFactory.Ingredient.Dough;
import Design_Pattern.FactoryMethod.A4_AbstractFactory.Ingredient.Sauce;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
}
