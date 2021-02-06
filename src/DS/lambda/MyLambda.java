package DS.lambda;

/**
 * lambda使用注意点
 * 接口必须时函数式接口，即只需要实现一个方法
 */
public class MyLambda {
    public static void main(String[] args){
        Lambda lambda ;

        // lambda
        lambda = (int num) -> System.out.println("Lambda1: " + num);
        lambda.lambda(1);

        // 简化： 参数只有一个可省略括号
        lambda = num -> System.out.println("Lambda2: " + num);
        lambda.lambda(2);
    }
}

interface Lambda{
    void lambda(int a);
//    void lambda1();
}