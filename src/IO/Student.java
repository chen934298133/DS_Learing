package IO;


import java.io.Serializable;

// 想要使其可序列化，必须实现'标记接口' Serializable
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;
    private String name;
    private  int age;
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
