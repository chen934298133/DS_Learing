package Design_Pattern.FactoryMethod.A2_SimpleFactory.SimplePizzaFactory;

import Design_Pattern.FactoryMethod.A1_SimpleOrigin.Pizza.CheesePizza;
import Design_Pattern.FactoryMethod.A1_SimpleOrigin.Pizza.GreekPizza;
import Design_Pattern.FactoryMethod.A1_SimpleOrigin.Pizza.Pizza;

public class SimplePizzaFactory {

    //所有客户使用此方法来实例化新对象
    public Pizza createPizza(String type){
        Pizza pizza = null;

        //从orderPizza中移过来的
        if(type.equals("cheese")){
            pizza = new CheesePizza();
        } else if (type.equals("greek")){
            pizza = new GreekPizza();
        }

        return pizza;
    }
}
