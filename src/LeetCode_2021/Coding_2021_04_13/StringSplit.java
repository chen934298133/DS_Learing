package LeetCode_2021.Coding_2021_04_13;

import java.text.DecimalFormat;
import java.util.Arrays;

public class StringSplit {
    public static void main(String[] args) {
        String str = "2020-07,2020-08,2020-12,2020-10,2020-11,2020-09";
        Float f = Float.parseFloat("24501")/3600;
//        f = f / 3600;
        DecimalFormat decimalFormat=new DecimalFormat(".00");
        String fStr = decimalFormat.format(f);
        System.out.println(fStr);
        String[] strSplit = str.split(",");
        System.out.println(Arrays.toString(strSplit));
    }
}
