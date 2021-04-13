package DS.Sort;

/**
 * 1. 定义一个学生类 `Student`，具有年龄 `age` 和姓名 `userName` 两个属性，并通过 `Comparable` 接口**提供比较规则**
 * 2. 定义测试类 `Test`，在测试类 `Test` 中定义测试方法 `Comparable getMax(Comparable c1,Comparable c2)`完成测试
 */
public class ComparableTest {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.setUserName("Jack");
        s1.setAge(20);

        Student s2 = new Student();
        s2.setUserName("Vent");
        s2.setAge(23);

        System.out.println(getMax(s1, s2));
    }

    public static Comparable getMax(Comparable c1, Comparable c2){
        int cmp = c1.compareTo(c2);
        if (cmp > 0){
            return c1;
        }else {
            return c2;
        }
    }
}

class Student implements Comparable<Student>{
    private String UserName;
    private int age;

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
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
                "UserName='" + UserName + '\'' +
                ", age=" + age +
                '}';
    }

    // 定义比较规则
    @Override
    public int compareTo(Student student) {
        return this.getAge() - student.getAge();
    }
}