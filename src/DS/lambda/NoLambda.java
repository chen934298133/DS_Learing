package DS.lambda;

public class NoLambda {
    // 优化版本1： 静态内部类
    static class ILambda_1 implements ILambda{
        @Override
        public void lambda() {
            System.out.println("I am Lambda1!");
        }
    }
    public static void main(String[] args) {
        // 原始繁琐版本1
        ILambda iLambda = new ILambda_0();
        iLambda.lambda();

        // 优化版本1：静态内部类
        iLambda = new ILambda_1();
        iLambda.lambda();

        // 优化版本2：局部内部类
        class ILambda_2 implements ILambda{
            @Override
            public void lambda() {
                System.out.println("I am Lambda2!");
            }
        }
        iLambda = new ILambda_2();
        iLambda.lambda();

        // 优化版本3： 匿名内部类
        iLambda = new ILambda() {
            @Override
            public void lambda() {
                System.out.println("I am lambda3!");
            }
        };
        iLambda.lambda();

        // 优化版本4：Lambda
        iLambda = () -> {
            System.out.println("I am lambda4!");
        };
        iLambda.lambda();
    }
}

interface ILambda {
    void lambda();
}

class ILambda_0 implements ILambda {
    @Override
    public void lambda() {
        System.out.println("I am Lambda0!");
    }
}
