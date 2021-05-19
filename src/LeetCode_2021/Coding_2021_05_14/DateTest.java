package LeetCode_2021.Coding_2021_05_14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) throws ParseException {
        
        System.out.println(new SimpleDateFormat("yyyy-MM-dd").parse("2021-01-01"));
        Date parse = new SimpleDateFormat("yyyy-MM-dd").parse("2021-01-01");
    }
}
