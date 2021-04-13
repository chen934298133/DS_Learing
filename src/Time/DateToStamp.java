package Time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateToStamp {
    public static String DateToStamp(long s){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date(s);
        String res = simpleDateFormat.format(date);
        return res;
    }

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse("2021-01-01 07:13:45");
        System.out.println(date.getTime());
        Object obj = "2021-01-01 07:13:45";
        long timeStamp = date.getTime();
//        System.out.println(timeStmp);

//        System.out.println("now: " + System.currentTimeMillis());
    }
}
