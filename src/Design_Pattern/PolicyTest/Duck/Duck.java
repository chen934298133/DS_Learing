package Design_Pattern.PolicyTest.Duck;

import Design_Pattern.PolicyTest.Flybehavior.FlyBehavior;
import Design_Pattern.PolicyTest.QuackBehavior.QuackBehavior;

//duck类
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck(){}

    public abstract void display();

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void swim(){
        System.out.println("I'm swimming!!");
    }

    public void setFlyBehavior(FlyBehavior f1){
        this.flyBehavior = f1;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
