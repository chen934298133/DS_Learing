package Design_Pattern.Pattern_4_FactoryMethod.A3_Factory.PizzaStore;


import Design_Pattern.Pattern_4_FactoryMethod.A3_Factory.Pizza.ChicagoStyleCheesePizza;
import Design_Pattern.Pattern_4_FactoryMethod.A3_Factory.Pizza.ChicagoStyleGreekPizza;
import Design_Pattern.Pattern_4_FactoryMethod.A3_Factory.Pizza.Pizza;

public class ChicagoStylePizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;

        //从orderPizza中移过来的  //从simplePizzaFactory中移过来的
        if(type.equals("ChicagoCheese")){
            pizza = new ChicagoStyleCheesePizza();
        } else if (type.equals("ChicagoGreek")){
            pizza = new ChicagoStyleGreekPizza();
        }

        return pizza;
    }
}
