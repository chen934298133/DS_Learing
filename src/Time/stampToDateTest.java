package Time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class stampToDateTest {
    public static String stampToDate(long s) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date(s);

        return simpleDateFormat.format(date);
    }

    public static int getAgeByBirthday(Date birthday) {
        Calendar cal = Calendar.getInstance();
        if (cal.before(birthday)) {
            throw new IllegalArgumentException(
                    "The birthDay is before Now.It's unbelievable!");
        }
        int yearNow = cal.get(Calendar.YEAR);
        int monthNow = cal.get(Calendar.MONTH) + 1;
        int dayOfMonthNow = cal.get(Calendar.DAY_OF_MONTH);
        cal.setTime(birthday);
        int yearBirth = cal.get(Calendar.YEAR);
        int monthBirth = cal.get(Calendar.MONTH) + 1;
        int dayOfMonthBirth = cal.get(Calendar.DAY_OF_MONTH);
        int age = yearNow - yearBirth;
        if (monthNow <= monthBirth) {
            if (monthNow == monthBirth) {
                if (dayOfMonthNow < dayOfMonthBirth) {
                    age--;
                }
            } else {
                age--;
            }
        }
        return age;
    }

    public static void main(String[] args) {

        // 获取当前时间戳
        Long nowTime = System.currentTimeMillis();
        System.out.println("nowTime: " + nowTime);
        long todayStartTime = ((nowTime - ((nowTime + TimeZone.getDefault().getRawOffset()) % (24 * 60 * 60 * 1000L))) / 1000);
        System.out.println("todayStartTime: " + todayStartTime);

        Date date = new Date();
        System.out.println("date: " + date);
        System.out.println("specifiedDate: " + new Date(todayStartTime));
        System.out.println(stampToDate(-1173168000000L));

        System.out.println(getAgeByBirthday(new Date()));    }

}
