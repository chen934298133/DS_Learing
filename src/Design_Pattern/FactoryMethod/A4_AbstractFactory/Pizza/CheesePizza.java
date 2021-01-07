package Design_Pattern.FactoryMethod.A4_AbstractFactory.Pizza;

import Design_Pattern.FactoryMethod.A4_AbstractFactory.PizzaIngredientFactory.PizzaIngredientFactory;

//实现方法与简单工厂相像，即原料工厂是由简单工厂实现的
public class CheesePizza extends Pizza{

    PizzaIngredientFactory ingredientFactory;

    //*******************************************
    public CheesePizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    };

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        cheese = ingredientFactory.createCheese();
        sauce = ingredientFactory.createSauce();
    }
}
