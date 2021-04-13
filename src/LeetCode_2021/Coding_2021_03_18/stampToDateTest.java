package LeetCode_2021.Coding_2021_03_18;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class stampToDateTest {
    public static String stampToDate(long s){
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date(s);
        return simpleDateFormat.format(date);
    }

    public static void main(String[] args){

        // 获取当前时间戳
        Long nowTime =  System.currentTimeMillis();
        System.out.println("nowTime: " + nowTime);
        long todayStartTime =  ((nowTime - ((nowTime + TimeZone.getDefault().getRawOffset()) % (24 * 60 * 60 * 1000L)))/1000);
        System.out.println("todayStartTime: " + todayStartTime);

        Date date = new Date();
        System.out.println("date: " + date);
        System.out.println("specifiedDate: " + new Date(todayStartTime));
        System.out.println(stampToDate(todayStartTime));
        String s = stampToDate(todayStartTime);
        System.out.println(s.substring(8));



    }

}
