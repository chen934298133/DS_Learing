package DS.lambda;

public class Test {
    public static void main(String[] args) {
        // 原始繁琐版本1
        ILambda iLambda = new ILambda_0();
        iLambda.lambda();

        // 优化版本1
        iLambda = new NoLambda.ILambda_1();
        iLambda.lambda();


    }
}
