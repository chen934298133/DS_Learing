package LeetCode_2021.Coding_2021_03_18;

import java.text.SimpleDateFormat;
import java.util.Date;

public class test {
    public static void main(String[] args){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date fwjljssj = new Date();

        String time = simpleDateFormat.format(fwjljssj).substring(5,10);
        System.out.println(time);
    }
}
