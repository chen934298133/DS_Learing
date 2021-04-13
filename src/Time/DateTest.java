package Time;

import java.util.Date;

public class DateTest {
    public static void main(String[] args){

        Date date = new Date();// Thu Mar 18 21:44:23 CST 2021
        System.out.println(date);

        // 1616075063369
        System.out.println(date.getTime());

        long dateStamp = date.getTime();// 1616075063369
        date = new Date(dateStamp);//Thu Mar 18 21:44:23 CST 2021
        System.out.println(date);

        System.out.println(new Date().getTime());
    }
}