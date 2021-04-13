package LeetCode_2021.Coding_2021_04_13;

import java.util.Arrays;

public class StringSplit {
    public static void main(String[] args) {
        String str = "2020-07,2020-08,2020-12,2020-10,2020-11,2020-09";
        String num = "12640";
        Long l = Long.parseLong("2113213");
        System.out.println(l);
        l = l / 3600;
        System.out.println(l);
        String[] strSplit = str.split(",");
        System.out.println(Arrays.toString(strSplit));
    }
}
