package LeetCode_2021.Coding_2021_05_10;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class mathTest {

    public String getTbDate() {
        Date date = null;
        String monthFormat;
        try {
            date = new Date();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.YEAR, -1);
        int month = c.get(Calendar.MONTH) + 1;
        if (month <= 9) {
            monthFormat = "0" + month;
        } else {
            monthFormat = String.valueOf(month);
        }
        String tbDate = c.get(Calendar.YEAR) + "-"
                + monthFormat + "-01";
        return tbDate;
    }
    public static void main(String[] args){
        mathTest test = new mathTest();
        System.out.println(test.getTbDate());
    }
}
