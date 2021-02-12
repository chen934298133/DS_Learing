package Design_Pattern.Pattern_4_FactoryMethod.A3_Factory.PizzaStore;


import Design_Pattern.Pattern_4_FactoryMethod.A3_Factory.Pizza.Pizza;

//现在PizzaStore已经有一个不错的系统，orderPizza负责处理订单
//只有create方法由每家披萨店来自己实现
public abstract class PizzaStore {

    public Pizza orderPizza(String type ) {
        Pizza pizza;

        //将create方法从工厂对象中移回PizzaStore中
        pizza = createPizza(type);

//        //添加一个对简单工厂的引用
//        SimplePizzaFactory factory;
//        //构造器，需要一个工厂作为参数
//        public PizzaStore(SimplePizzaFactory factory){
//            this.factory = factory;
//        }
//
//        public Pizza orderPizza(String type ){
//            Pizza pizza;
//
//            //使用工厂创建披萨
//            //注意我们将new替换为工厂对象的创建方法，不再使用具体实例化。
//            pizza = factory.createPizza("cheese");

        //preparing!
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        //take out!
        return pizza;
    }

    //在PizzaStore里，工厂方法现在是抽象的
    protected abstract Pizza createPizza(String type);
}
