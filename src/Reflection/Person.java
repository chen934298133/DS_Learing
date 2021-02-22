package Reflection;

public class Person {
    private String name = "Tom";
    public int age = 18;
    public int height = 180;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(){

    }

    public Person(String name, int age, int height){
        this.name = name;
        this.age = age;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }

    private void say(){
        System.out.println("private say()...");
    }

    private void work(){
        System.out.println("private work()...");
    }
}
