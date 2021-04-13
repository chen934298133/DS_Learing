package LeetCode_2021.Coding_2021_03_18;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateToStamp {
    public static String DateToStamp(long s){
        s *= 1000;
        String res;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date(s);
        res = simpleDateFormat.format(date);
        return res;
    }

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse("2021-01-01 07:13:45");
        System.out.println(date.getTime());
        Object obj = "2021-01-01 07:13:45";
        long timeStamp = date.getTime();
        System.out.println(timeStamp);

        System.out.println("now: " + System.currentTimeMillis());
    }
}
