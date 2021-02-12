package Design_Pattern.Pattern_4_FactoryMethod.A3_Factory.PizzaStore;


import Design_Pattern.Pattern_4_FactoryMethod.A3_Factory.Pizza.NYStyleCheesePizza;
import Design_Pattern.Pattern_4_FactoryMethod.A3_Factory.Pizza.NYStyleGreekPizza;
import Design_Pattern.Pattern_4_FactoryMethod.A3_Factory.Pizza.Pizza;

public class NYStylePizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {

        Pizza pizza = null;

        //从orderPizza中移过来的  //从simplePizzaFactory中移过来的
        if(type.equals("NYCheese")){
            pizza = new NYStyleCheesePizza();
        } else if (type.equals("NYCreek")){
            pizza = new NYStyleGreekPizza();
        }

        return pizza;
    }
}
