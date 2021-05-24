package LeetCode_2021.Coding_2021_05_21;

public class Offer16 {
    public double myPow(double x, int n) {
        double temp = x;
        if (n < 0) {
            x = 1 / x;
            n = -n;
            temp = x;
        }
        for (int i = 0; i < n - 1; i++) {
            temp = temp * x;
        }
        return temp;
    }

    public double myPow2(double x, int n) {
        // 特殊情况 任何数字的 0 次方都等于 1
        if (x == 0) return 0;
        // 由于java整型范围是 [−2147483648,2147483647] 所以在执行 n = -n 时会越界出错
        // 解决方法是增大数值类型范围 先将 n 存入 long 变量 b ，后面用 b 操作即可。
        long b = n;
        //
        double res = 1.0;
        // 若指数为负数，则变为倒数相乘
        if (b < 0) {
            x = 1 / x;
            b = -b;
        }
        // 循环遍历，若指数大于0 则不断二分运算
        while (b > 0) {
            // 若指数为奇数，则把结果直接与原数乘一次
            if ((b & 1) == 1) res *= x;
            // 二分法运算所在，将运算后的值相乘，而不是将结果与原数相乘，这样就会减少很多次运算
            x *= x;
            // 位运算,将十进制转为二进制，将二进制数右移一位（即1101和1100右移后为同一个数字）
            b >>= 1;
        }
        return res;
    }

    public double myPow1(double x, int n) {
        // 如果n == 0，返回1
        if (n == 0) {
            return 1;
        }
        // 如果n < 0，最终结果为 1/x^{-n}
        if (n < 0) {
            return 1 / (x * myPow1(x, -n - 1));

        // 如果n为奇数，最终结果为 {x * x ^ {n - 1}}
        } else if (n % 2 == 1) {
            return x * myPow1(x, n - 1);

        //如果n为偶数，最终结果为 {x ^ {2*(n/2)}}
        } else {
            return myPow1(x * x, n / 2);
        }

    }

    public static void main(String[] args) {
        Offer16 offer16 = new Offer16();
//        System.out.println(offer16.myPow(2.00, -3));
        System.out.println(offer16.myPow2(2.00, 18));
        System.out.println(offer16.myPow1(2.00, 18));
//        System.out.println(Integer.toBinaryString(5));
//        System.out.println(Integer.toBinaryString(4));
//        System.out.println(5 >> 1);
//        System.out.println(4 >> 1);
    }
}
