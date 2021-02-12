package Design_Pattern.Pattern_4_FactoryMethod.A4_AbstractFactory.PizzaIngredientFactory;

import Design_Pattern.Pattern_4_FactoryMethod.A4_AbstractFactory.Ingredient.*;
import Design_Pattern.Pattern_4_FactoryMethod.A4_AbstractFactory.Ingredient.NY.MarinaraSauce;
import Design_Pattern.Pattern_4_FactoryMethod.A4_AbstractFactory.Ingredient.NY.ReggianoCheese;
import Design_Pattern.Pattern_4_FactoryMethod.A4_AbstractFactory.Ingredient.NY.ThinCrustDough;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }
}
