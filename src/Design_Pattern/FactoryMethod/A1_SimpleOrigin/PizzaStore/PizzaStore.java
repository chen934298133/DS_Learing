package Design_Pattern.FactoryMethod.A1_SimpleOrigin.PizzaStore;

import Design_Pattern.FactoryMethod.A1_SimpleOrigin.Pizza.CheesePizza;
import Design_Pattern.FactoryMethod.A1_SimpleOrigin.Pizza.GreekPizza;
import Design_Pattern.FactoryMethod.A1_SimpleOrigin.Pizza.Pizza;

public class PizzaStore {

    public Pizza orderPizza(String type ){
        Pizza pizza = null;

        //order!
        if(type.equals("cheese")){
            pizza = new CheesePizza();
        } else if (type.equals("greek")){
            pizza = new GreekPizza();
        }

        //preparing!
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        //take out!
        return pizza;
    }
}
