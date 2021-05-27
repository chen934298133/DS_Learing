package Time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TimeTest {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        // 获取当前年份
        Integer year = calendar.get(Calendar.YEAR);

        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        calendar.clear();
        calendar.set(Calendar.YEAR, year);
        Date beginTime = calendar.getTime();
        System.out.println(sf.format(beginTime));

        calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(Calendar.YEAR, year);
        calendar.roll(Calendar.DAY_OF_YEAR, -1);
        Date endTime = new Date(calendar.getTime().getTime());
        endTime = new Date(calendar.getTime().getTime() + 24 * 3600 * 1000);
        System.out.println(sf.format(endTime));
        System.out.println(Calendar.DAY_OF_YEAR);

        System.out.println(sf.format(new Date().getTime()));
        System.out.println(sf.format(new Date().getTime() + 24 * 3600 * 1000));
        System.out.println(new Date().getTime() + 24 * 3600 * 1000);
        System.out.println(new Date());

    }
}
