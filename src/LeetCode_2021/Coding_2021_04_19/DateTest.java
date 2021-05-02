package LeetCode_2021.Coding_2021_04_19;

import Time.SimpleDateFormatTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) throws ParseException {
        // 当前时间戳
        System.out.println("System.currentTimeMillis()::: " + System.currentTimeMillis());
        System.out.println("new Date().getTime()::: " + new Date().getTime());
        System.out.println("Calendar.getInstance().getTimeInMillis()::: " + Calendar.getInstance().getTimeInMillis());
        // 这种方式速度最慢，这是因为 Calendar 要处理时区问题会耗费较多的时间。

        // Date 转时间戳
        // new Date(Long long)
        Date dateTemp = new Date(); // 当前date 转 时间戳
        Date dateParse = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("1997-3-18 22:03:36");   // 指定date 转 时间戳
        System.out.println("new Date().getTime()::: " + dateTemp.getTime());
        System.out.println("new SimpleDateFormat().parse().getTime()::: " + dateParse.getTime());

        // String 转 Date
        String str = "1997-10-26";
        dateTemp = new SimpleDateFormat("yyyy-MM-dd").parse(str);
        System.out.println(dateTemp);

        // 时间戳 转 Date
        Long aLong = new Date(System.currentTimeMillis()).getTime();
        System.out.println(new Date(aLong));// 当前时间戳 转 date
        System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(aLong)); // 时间戳 转 指定date

        // format(date) 返回 StringBuffer
        String stringFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        System.out.println("String: SimpleDateFormat.format::: " + stringFormat);

        // parse(string) 返回 Date
        dateParse = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("1997-3-18 22:03:36");
        System.out.println("Date: SimpleDateFormat.parse::: " + dateParse);


        System.out.println(getAgeByBirthday(dateParse) + "岁");
    }

    public static int getAgeByBirthday(Date birthday) {
        Calendar cal = Calendar.getInstance();
        if (cal.before(birthday)) {
            throw new IllegalArgumentException("The birthDay is before Now.It's unbelievable!");
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
}
