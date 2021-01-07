package Design_Pattern.FactoryMethod.A4_AbstractFactory.PizzaIngredientFactory;

import Design_Pattern.FactoryMethod.A4_AbstractFactory.Ingredient.Cheese;
import Design_Pattern.FactoryMethod.A4_AbstractFactory.Ingredient.Chicago.ChicagoCheese;
import Design_Pattern.FactoryMethod.A4_AbstractFactory.Ingredient.Chicago.PlumTomatoSauce;
import Design_Pattern.FactoryMethod.A4_AbstractFactory.Ingredient.Chicago.ThickCrustDough;
import Design_Pattern.FactoryMethod.A4_AbstractFactory.Ingredient.Dough;
import Design_Pattern.FactoryMethod.A4_AbstractFactory.Ingredient.Sauce;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ChicagoCheese();
    }
}
