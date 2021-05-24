package LeetCode_2021.Coding_2021_05_21;

public class Offer16 {
    public double myPow(double x, int n) {
        double temp = x;
        if(n < 0) {
            x = 1 / x;
            n = -n;
            temp = x;
        }
        for(int i = 0; i < n-1; i++){
            temp = temp*x;
        }
        return temp;
    }
    public double myPow2(double x, int n) {
        if (x == 0) return 0;
        long b = n;
        double res = 1.0;

        if (b < 0) {
            x = 1 / x;
            b = -b;
        }
        while (b > 0) {
            if ((b & 1) == 1) res *= x;
            x *= x;
            b >>= 1;
        }
        return res;
    }
    public static void main(String[] args){
        Offer16 offer16 = new Offer16();
        System.out.println(offer16.myPow(2.00, -3));
        System.out.println(2.00*2.00);
        int i = 2;
        String string = Integer.toBinaryString(i);
        System.out.println(string);
        System.out.println(i>>1);
        int i2 = i<< 1;
        System.out.println(i2);
        System.out.println(i2<<2);

        System.out.println(Integer.toBinaryString(22));
    }
}
