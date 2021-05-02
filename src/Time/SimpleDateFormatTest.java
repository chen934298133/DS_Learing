package Time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * G 年代标志符
 * y 年
 * M 月
 * d 日
 * h 时 在上午或下午 (1~12)
 * H 时 在一天中 (0~23)
 * m 分
 * s 秒
 * S 毫秒
 * E 星期
 * D 一年中的第几天
 * F 一月中第几个星期几
 * w 一年中第几个星期
 * W 一月中第几个星期
 * a 上午 / 下午 标记符
 * k 时 在一天中 (1~24)
 * K 时 在上午或下午 (0~11)
 * z 时区
 */
public class SimpleDateFormatTest {
    public static void main(String[] args) throws ParseException {

        // 主要是构造方法 及 format()方法
        SimpleDateFormat simpleDateFormatTest = new SimpleDateFormat();
        SimpleDateFormat myFmt = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        SimpleDateFormat myFmt1 = new SimpleDateFormat("yy/MM/dd HH:mm");
        SimpleDateFormat myFmt2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//等价于now.toLocaleString()
        SimpleDateFormat myFmt3 = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒 E ");
        SimpleDateFormat myFmt4 = new SimpleDateFormat("一年中的第 D 天 一年中第w个星期 一月中第W个星期 在一天中k时 z时区 G");
        Date now = new Date();
        Date now1 = myFmt2.parse("2021-3-18 22:03:36");
        System.out.println("123" + now1);
        System.out.println("123" + myFmt2.format(now1));

        System.out.println(myFmt.format(now));
        System.out.println(myFmt1.format(now));
        System.out.println(myFmt2.format(now));
        System.out.println(myFmt3.format(now));
        System.out.println(myFmt4.format(now));
        System.out.println(now.toLocaleString());
        System.out.println(now.toString());

//        Date parse = myFmt2.parse("2021-3-18");
//        System.out.println("parse: " + parse);

        String format = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        System.out.println(format);
    }
}
