package Design_Pattern.FactoryMethod.A4_AbstractFactory.Pizza;

import Design_Pattern.FactoryMethod.A4_AbstractFactory.Ingredient.Cheese;
import Design_Pattern.FactoryMethod.A4_AbstractFactory.Ingredient.Dough;
import Design_Pattern.FactoryMethod.A4_AbstractFactory.Ingredient.Sauce;

public abstract class Pizza {

    //准备原料
    String name;
    Dough dough;
    Sauce sauce;
    Cheese cheese;

    //收集披萨所需的原料
    public abstract void prepare();

    public void bake(){
        System.out.println("baking !");
    }

    public void cut(){
        System.out.println("cutting ! ");
    }

    public void box(){
        System.out.println("boxing !");
        System.out.println("-----------next------------");
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String toString(){
        //打印披萨
        return name + dough;
//        return name + dough + sauce + cheese;
    }

}
