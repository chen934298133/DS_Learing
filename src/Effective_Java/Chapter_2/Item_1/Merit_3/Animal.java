package Effective_Java.Chapter_2.Item_1.Merit_3;

public class Animal {

    protected Animal(){}

    private static Animal dog;
    private static Animal cat;

    public static Animal getDog(){
        if (dog == null) dog = new Dog();
        return dog;
    }

    public static Animal getCat(){
        if (cat == null) cat = new Cat();
        return cat;
    }

}

