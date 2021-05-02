package LeetCode_2021.Coding_2021_04_17;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToLong {
    public static void main(String[] args){
        String str = "8413";
        System.out.println(String.valueOf(Double.parseDouble(str)/3600) +"小时");
        System.out.println(String.format("%.2f",Double.parseDouble(str)/3600) +"小时");

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Date date = new Date(s);
//        System.out.println(date);
    }
}
