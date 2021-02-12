package Design_Pattern.Pattern_4_FactoryMethod.A2_SimpleFactory.Test;


import Design_Pattern.Pattern_4_FactoryMethod.A2_SimpleFactory.PizzaStore.PizzaStore;
import Design_Pattern.Pattern_4_FactoryMethod.A2_SimpleFactory.SimplePizzaFactory.SimplePizzaFactory;

public class Test01 {
    public static void main(String[] args){
        SimplePizzaFactory factory1 = new SimplePizzaFactory();
        PizzaStore s1 = new PizzaStore(factory1 );
        s1.orderPizza("cheese");
    }
}
