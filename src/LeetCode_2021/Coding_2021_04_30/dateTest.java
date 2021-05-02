package LeetCode_2021.Coding_2021_04_30;

import Time.SimpleDateFormatTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class dateTest {
    public static void main(String[] args) throws ParseException {
        String date = "2021-03-13";
        new SimpleDateFormat("yyyy-MM-dd").format(new SimpleDateFormat("yyyy-MM-dd").parse(date));
        new SimpleDateFormat("yyyy-MM-dd").format(new Date(new SimpleDateFormat("yyyy-MM-dd").parse(date).getTime() + 24 * 3600 * 1000));
    }
}
