package Time;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
    public static void main(String[] args){

        System.out.println(Calendar.getInstance().get(Calendar.MONTH) + 1);

        Calendar calendar = Calendar.getInstance();// 获取当前日期
        calendar.add(Calendar.YEAR, 0);
        calendar.add(Calendar.MONTH, 0);
        calendar.set(Calendar.DAY_OF_MONTH, 1);// 设置为1号,当前日期既为本月第一天
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        System.out.println(new Date(calendar.getTimeInMillis()));
    }
}
