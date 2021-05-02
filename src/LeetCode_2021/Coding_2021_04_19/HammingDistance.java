package LeetCode_2021.Coding_2021_04_19;

import Time.SimpleDateFormatTest;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class HammingDistance {

    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }

    public int hammingDistance2(int x, int y) {
        int xor = x ^ y;
        int distance = 0;
        while (xor != 0) {
            distance += 1;
            xor = xor & (xor-1);
        }
        return distance;
    }


    public static void main(String[] args) {
        HammingDistance hamming = new HammingDistance();
        System.out.println(hamming.hammingDistance(0, 3));
        System.out.println(hamming.hammingDistance2(0, 3));
        int temp = 0 ^ 3;
        // 0000 0000
        // 0000 0011
        // = 0000 0011 = 3
        System.out.println(temp);
        System.out.println(temp >> 1);


        System.out.println(hamming.intToBinary(4));

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        simpleDateFormat.format(new Date());
        System.out.println(simpleDateFormat.format(new Date()));

        Date date = new Date();
    }

    public String intToBinary(Integer temp){
        String tempStr = "";
        String str2 = Integer.toBinaryString(temp);
        //判断一下：如果转化为二进制为0或者1或者不满8位，要在数后补0
        int bit = 8 - str2.length();
        if (str2.length() < 8) {
            for (int j = 0; j < bit; j++) {
                str2 = "0" + str2;
            }
        }
        tempStr += str2;
        return tempStr;
    }

}
