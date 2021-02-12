package Design_Pattern.Pattern_4_FactoryMethod.A2_SimpleFactory.PizzaStore;

import Design_Pattern.Pattern_4_FactoryMethod.A2_SimpleFactory.SimplePizzaFactory.SimplePizzaFactory;
import Design_Pattern.Pattern_4_FactoryMethod.A1_SimpleOrigin.Pizza.Pizza;

public class PizzaStore {

    //添加一个对简单工厂的引用
    SimplePizzaFactory factory;
    //构造器，需要一个工厂作为参数
    public PizzaStore(SimplePizzaFactory factory){
        this.factory = factory;
    }

    public Pizza orderPizza(String type ){
        Pizza pizza;

        //使用工厂创建披萨
        //注意我们将new替换为工厂对象的创建方法，不再使用具体实例化。
        pizza = factory.createPizza(type);      //注意此处的变化**************************************************************
//        if(type.equals("cheese")){
//            pizza = new CheesePizza();
//        } else if (type.equals("greek")){
//            pizza = new GreekPizza();
//        }

        //preparing!
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        //take out!
        return pizza;
    }
}
