package LeetCode_2021.Coding_2021_05_28;

import java.text.SimpleDateFormat;
import java.util.Date;

public class hex {
    private static String[] binaryArray =
            {"0000","0001","0010","0011",
                    "0100","0101","0110","0111",
                    "1000","1001","1010","1011",
                    "1100","1101","1110","1111"};

    public static void main(String[] args) {
        // 3B130F030615
        // 4040 0700 02FF 3B130F030615 3517000006FF 000000000000 1100 02 02 01 87 00 28 35170000 2300 3B130F030615 83 2323
        // 4040070002FF3B130F0306153517000006FF00000000000011000202018700283517000023003B130F030615832323
        String str = "4040070002FF3B130F0306153517000006FF0000000000001100020201870028D3517000023003B130F030615832323";
        str = "4040030002FF2B040A1006144B00000006FF00000000000011000202018700284B00000023002B040A1006144D2323";
//        str = "4040050002FF090B0A1006144B00000006FF00000000000011000202018700284B0000002101090B0A100614182323";
        String string = "4040020002FF1F32091006144B00000006FF00000000000022000203028700284B00000080A3FF1F32091006148700284B00000088870D1F32091006143A2323";
        // 判断是状态量包还是模拟量包

//        System.out.println(getReturnHex(str));
//        System.out.println(getReturnHex(string));

        String json = "\"{\"msg\":{\"at\":1623114304136,\"imei\":\"869664048207529\",\"type\":1,\"ds_id\":\"3200_0_5750\",\"value\":\"4040010002FF3804090806153517000006FF0000000000001100020201870028351700002100380409080615552323\",\"dev_id\":727859486},\"msg_signature\":\"GICel6DJwzBypXe8lxJvHg==\",\"nonce\":\"Ys*U7n$%\"}\n";
//        System.out.println(str.substring(54, 56));
//        System.out.println(Integer.parseInt(str.substring(0, 2)));
//        String time = str.substring(12, 24);
//        System.out.println(time);
//        time = "10120E0A0315";
//        System.out.print(Integer.parseInt(time.substring(10, 12), 16) + "年");
//        System.out.print(Integer.parseInt(time.substring(8, 10), 16) + "月");
//        System.out.print(Integer.parseInt(time.substring(6, 8), 16) + "日");
//        System.out.print(Integer.parseInt(time.substring(4, 6), 16) + "时");
//        System.out.print(Integer.parseInt(time.substring(2, 4), 16) + "分");
//        System.out.print(Integer.parseInt(time.substring(0, 2), 16) + "秒");
//        System.out.println();
//        time = "16130E0A0315";
//        System.out.print(Integer.parseInt(time.substring(10, 12), 16) + "年");
//        System.out.print(Integer.parseInt(time.substring(8, 10), 16) + "月");
//        System.out.print(Integer.parseInt(time.substring(6, 8), 16) + "日");
//        System.out.print(Integer.parseInt(time.substring(4, 6), 16) + "时");
//        System.out.print(Integer.parseInt(time.substring(2, 4), 16) + "分");
//        System.out.print(Integer.parseInt(time.substring(0, 2), 16) + "秒");
//        System.out.println(secToTime("3B130F030615"));
//        System.out.println();
//        System.out.println(Integer.parseInt("15", 16));
//        System.out.println(Integer.parseInt("0D", 16));
//        System.out.println(Integer.toHexString(21));
//        System.out.println(new SimpleDateFormat("yyMMddhhmmss").format(new Date()));
//        String yyMMddhhmmss = new SimpleDateFormat("yyMMddhhmmss").format(new Date());
//        System.out.println(Integer.toHexString(Integer.parseInt(yyMMddhhmmss.substring(0, 2))));
//        System.out.println(Integer.toHexString(Integer.parseInt(yyMMddhhmmss.substring(2, 4))));
//        System.out.println(Integer.toHexString(Integer.parseInt(yyMMddhhmmss.substring(4, 6))));
//        System.out.println(Integer.toHexString(Integer.parseInt(yyMMddhhmmss.substring(6, 8))));
//        System.out.println(Integer.toHexString(Integer.parseInt(yyMMddhhmmss.substring(8, 10))));
//        System.out.println(Integer.toHexString(Integer.parseInt(yyMMddhhmmss.substring(10, 12))));

//        System.out.println("时间标签" + intToHex(Integer.parseInt(yyMMddhhmmss.substring(10, 12)), 2) + intToHex(Integer.parseInt(yyMMddhhmmss.substring(8, 10)), 2) + intToHex(Integer.parseInt(yyMMddhhmmss.substring(6, 8)), 2) + intToHex(Integer.parseInt(yyMMddhhmmss.substring(4, 6)), 2) + intToHex(Integer.parseInt(yyMMddhhmmss.substring(2, 4)), 2) + intToHex(Integer.parseInt(yyMMddhhmmss.substring(0, 2)), 2));
//        System.out.println(intToHex(Integer.parseInt(yyMMddhhmmss.substring(8, 10)), 2));
//        System.out.println(intToHex(Integer.parseInt(yyMMddhhmmss.substring(6, 8)), 2));
//        System.out.println(intToHex(Integer.parseInt(yyMMddhhmmss.substring(4, 6)), 2));
//        System.out.println(intToHex(Integer.parseInt(yyMMddhhmmss.substring(2, 4)), 2));
//        System.out.println(intToHex(Integer.parseInt(yyMMddhhmmss.substring(0, 2)), 2));


        System.out.println(Integer.parseInt("1771", 16));
        System.out.println(Integer.parseInt("0002", 16));
        System.out.println(Integer.parseInt("0000", 16));

        System.out.println(Integer.parseInt("1772", 16));
        System.out.println(Integer.parseInt("0001", 16));
        System.out.println(Integer.parseInt("02", 16));
        System.out.println(Integer.parseInt("00", 16));

        System.out.println(Integer.parseInt("1773", 16));
        System.out.println(Integer.parseInt("0001", 16));
        System.out.println(Integer.parseInt("00", 16));

        System.out.println(Integer.parseInt("1784", 16));
        System.out.println(Integer.parseInt("0001", 16));
        System.out.println(Integer.parseInt("00", 16));

        System.out.println(Integer.parseInt("1785", 16));
        System.out.println(Integer.parseInt("0001", 16));
        System.out.println(Integer.parseInt("FF", 16));
        System.out.println(Integer.parseInt("02", 16));
//
        System.out.println(Integer.parseInt("1786", 16));
        System.out.println(Integer.parseInt("0002", 16));
        System.out.println(Integer.parseInt("000F", 16));
//
        System.out.println(Integer.parseInt("1771", 16));
        System.out.println(Integer.parseInt("0002", 16));
        System.out.println(Integer.parseInt("0000", 16));
//
        System.out.println(Integer.parseInt("1774", 16));
        System.out.println(Integer.parseInt("0001", 16));
        System.out.println(Integer.parseInt("64", 16));
//
        System.out.println(Integer.parseInt("1775", 16));
        System.out.println(Integer.parseInt("000F", 16));
        System.out.println(hexStringToString("383636393731303331383034333236"));
//
        System.out.println(Integer.parseInt("1776", 16));
        System.out.println(Integer.parseInt("000F", 16));
        System.out.println(hexStringToString("343630303433313932363031343033"));

        System.out.println(Integer.parseInt("1777", 16));
        System.out.println(Integer.parseInt("0002", 16));
        System.out.println(Integer.parseInt("FFAF", 16));

        String strTemp = "17710002000017720001021773000100178400010017850001FF17860002000F17740001641775000F3836363937313033313830343332361776000F34363030343331393236303134303317770002FFAE";
        System.out.println("==============================================================================================================================================");
//        System.out.println(strTemp.substring(4));
//        System.out.println(Integer.parseInt(strTemp.substring(0, 4), 16));
//        Integer length = Integer.parseInt(strTemp.substring(4, 8), 16) * 2;
//        System.out.println(length);
//        strTemp = strTemp.substring(8);
//        System.out.println(strTemp.substring(0, length));
        while (strTemp.length() != 0) {
            Integer type_ = Integer.parseInt(strTemp.substring(0, 4), 16);
            System.out.println(type_);
            Integer length_ = Integer.parseInt(strTemp.substring(4, 8), 16) * 2;
            System.out.println(length_);
            strTemp = strTemp.substring(8);
            String value_ = strTemp.substring(0, length_);
            if (length_ == 30) {
                System.out.println(hexStringToString(value_));
            }else {
                System.out.println(Integer.parseInt(value_, 16));
            }
            strTemp = strTemp.substring(length_);
        }


        // 文档状态包
        String strTemp2 = "40 40 03 00 02 FF 00 1E 10 13 0B 12 00 00 00 00 04 FF 00 00 00 00 00 00 5E 00 02 02 02 84 00 81 00 00 00 00 00 00 46 39 31 36 34 2D 54 5F 56 31 2E 30 20 4E 6F 76 20 31 36 20 32 30 31 38 20 31 35 3A 33 34 00 00 1E 10 13 0B 12 83 00 80 00 00 00 00 00 00 46 39 31 36 34 2D 54 5F 56 31 2E 30 20 4E 6F 76 20 31 36 20 32 30 31 38 20 31 35 3A 33 34 00 00 1E 10 13 0B 12 23 23 23";
        String s = strTemp2.replace(" ", "");
        s = "4040030002FF001E10130B120000000004FF0000000000005E0002020284008100000000000046393136342D545F56312E30204E6F7620313620323031382031353A333400001E10130B1283008000000000000046393136342D545F56312E30204E6F7620313620323031382031353A333400001E10130B12232323";
        System.out.println("文档状态包长度: " + s.length());
        // 文档模拟包
        strTemp2 = "40 40 04 00 02 FF 11 1E 10 13 0B 12 00 00 00 00 04 FF 00 00 00 00 00 00 62 00 02 03 06 84 00 81 00 00 00 00 9A 86 00 11 1E 10 13 0B 12 84 00 81 00 00 00 00 80 0B 00 11 1E 10 13 0B 12 84 00 81 00 00 00 00 88 4A 0F 11 1E 10 13 0B 12 83 00 80 00 00 00 00 05 00 00 11 1E 10 13 0B 12 83 00 80 00 00 00 00 80 0B 00 11 1E 10 13 0B 12 83 00 80 00 00 00 00 88 4A 0F 11 1E 10 13 0B 12 93 23 23";
        s = strTemp2.replace(" ", "");
        s = "4040040002FF111E10130B120000000004FF0000000000006200020306840081000000009A8600111E10130B1284008100000000800B00111E10130B1284008100000000884A0F111E10130B1283008000000000050000111E10130B1283008000000000800B00111E10130B1283008000000000884A0F111E10130B12932323";
        System.out.println("文档模拟包长度: " + s.length());

        // 设备返回状态包
        s = "4040150002FF1C2611110615AA07000004FF0000000000003000020201830080AA070000010046393136342D54442D4E425F56312E302E315F5354442D4F4E5F32303231001C2611110615292323";
        System.out.println("设备返回状态包长度: " + s.length());
        System.out.println((s.substring(72, 76)));
        // 设备返回模拟量包
        s = "4040160002FF312611110615AA07000004FF0000000000003200020303830080AA070000050000312611110615830080AA07000080A5FF312611110615830080AA07000088F70D312611110615262323";
        System.out.println("设备返回状态包长度: " + s.length());
        // 设备返回的不知道是什么包
        s = "7B22444556223A22334132342C30303030303035302C3836393636343034383236363738302C343630303433313932363031313935227D";
        System.out.println("设备返回状态包: " + s.length());

//        System.out.println(judgeType(strTemb));


//        Long l = 1623986005342L;
//        System.out.println(new Date(l));
        System.out.println(hexStringToString("46393136342D54442D4E425F56312E302E315F5354442D4F4E5F3230323100"));
        System.out.println(parseHexStr2Byte("0001"));
        byte[] bytes = parseHexStr2Byte("AA");
        for (byte aByte : bytes) {
            System.out.println(aByte);
        }


        Integer num = Integer.parseInt("0080", 16);
        System.out.println(Integer.toBinaryString(num));
        System.out.println(String.format("%016d", Integer.valueOf(Integer.toBinaryString(num))));
        String valueFormat = String.format("%016d", Integer.valueOf(Integer.toBinaryString(num)));
        System.out.println(valueFormat.substring(15,16));
        System.out.println(valueFormat.substring(14,15));
        System.out.println(valueFormat.substring(8,9));

        String aaaaaa = "4040150002FF1C2611110615AA07000004FF0000000000003000020201830080AA070000010046393136342D54442D4E425F56312E302E315F5354442D4F4E5F32303231001C2611110615292323";
        String str1 = aaaaaa.substring(72, 74);
        String str2 = aaaaaa.substring(74, 76);
        String value = str2+str1;
        System.out.println(value);

        System.out.println(hexStringToString("EA"));
        System.out.println(String.format("%08d", Integer.valueOf(Integer.toBinaryString(87))));
        System.out.println(Integer.toBinaryString(87));

    }

    public static String bytes2BinaryStr(byte[] bArray){

        String outStr = "";
        int pos = 0;
        for(byte b:bArray){
            //高四位
            pos = (b&0xF0)>>4;
            outStr+=binaryArray[pos];
            //低四位
            pos=b&0x0F;
            outStr+=binaryArray[pos];
        }
        return outStr;

    }

    public static byte[] parseHexStr2Byte(String hexStr) {
        if (hexStr.length() < 1)
            return null;
        byte[] result = new byte[hexStr.length() / 2];
        for (int i = 0; i < hexStr.length() / 2; i++) {
            int high = Integer.parseInt(hexStr.substring(i * 2, i * 2 + 1), 16);
            int low = Integer.parseInt(hexStr.substring(i * 2 + 1, i * 2 + 2),
                    16);
            result[i] = (byte) (high * 16 + low);
        }
        return result;
    }


    /**
     * 16进制转换成为string类型字符串
     *
     * @param s
     * @return
     */
    public static String hexStringToString(String s) {
        if (s == null || s.equals("")) {
            return null;
        }
        s = s.replace(" ", "");
        byte[] baKeyword = new byte[s.length() / 2];
        for (int i = 0; i < baKeyword.length; i++) {
            try {
                baKeyword[i] = (byte) (0xff & Integer.parseInt(s.substring(i * 2, i * 2 + 2), 16));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        try {
            s = new String(baKeyword, "UTF-8");
            new String();
        } catch (Exception e1) {
            e1.printStackTrace();
        }
        return s;
    }

    // 获取返回报文
    public static String getReturnHex(String str) {
        String before = str.substring(0, 12);
        String time = getTimeHex();
        String toAddress = getToAddress(str);
        String equAddress = getEquAddress(str);
        String temp = getTimeHex();
        String last = "2323";
        return before + time + toAddress + equAddress + temp + last;
    }

    // 获取部件地址
    public static String getEquAddress(String str) {
//        if (judgeType(str).equals("02")){
        return str.substring(60, 68);
//        }
//            return str.substring(36,48);
    }

    // 获取目的地址
    public static String getToAddress(String str) {
        return str.substring(36, 48);
    }

    // 获取此刻十六进制时间标签
    public static String getTimeHex() {
        String yyMMddhhmmss = new SimpleDateFormat("yyMMddhhmmss").format(new Date());
//        System.out.println("时间标签" + intToHex(Integer.parseInt(yyMMddhhmmss.substring(10, 12)), 2) + intToHex(Integer.parseInt(yyMMddhhmmss.substring(8, 10)), 2) + intToHex(Integer.parseInt(yyMMddhhmmss.substring(6, 8)), 2) + intToHex(Integer.parseInt(yyMMddhhmmss.substring(4, 6)), 2) + intToHex(Integer.parseInt(yyMMddhhmmss.substring(2, 4)), 2) + intToHex(Integer.parseInt(yyMMddhhmmss.substring(0, 2)), 2));
        return (intToHex(Integer.parseInt(yyMMddhhmmss.substring(10, 12)), 2) + intToHex(Integer.parseInt(yyMMddhhmmss.substring(8, 10)), 2) + intToHex(Integer.parseInt(yyMMddhhmmss.substring(6, 8)), 2) + intToHex(Integer.parseInt(yyMMddhhmmss.substring(4, 6)), 2) + intToHex(Integer.parseInt(yyMMddhhmmss.substring(2, 4)), 2) + intToHex(Integer.parseInt(yyMMddhhmmss.substring(0, 2)), 2));
    }

    // 判断是状态量包还是模拟量包
    public static String judgeType(String str) {
        if (str.substring(54, 56).equals("02")) {
            System.out.println("此为状态量包");
            return "02";
        } else if (str.substring(54, 56).equals("03")) {
            System.out.println("此为模拟量包");
            return "03";
        }
        return null;
    }

    private static String intToHex(int n, int size) {
        StringBuffer s = new StringBuffer();
        String a;
        char[] b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        while (n != 0) {
            s = s.append(b[n % 16]);
            n = n / 16;
        }
        a = s.reverse().toString();
        a = add_zore(a, size);
        return a;
    }

    public static String add_zore(String str, int size) {
        if (str.length() < size) {
            str = "0" + str;
            str = add_zore(str, size);
            return str;
        } else {
            return str;
        }
    }

    public static String secToTime(String str) {
        int time = Integer.valueOf(str);
        String timeStr = null;
        int hour = 0;
        int minute = 0;
        int second = 0;
        if (time <= 0)
            return "00:00";
        else {
            minute = time / 60;
            if (minute < 60) {
                second = time % 60;
                timeStr = unitFormat(minute) + "分" + unitFormat(second) + "秒";
            } else {
                hour = minute / 60;
                if (hour > 99)
                    return "99:59:59";
                minute = minute % 60;
                second = time - hour * 3600 - minute * 60;
                timeStr = unitFormat(hour) + "时" + unitFormat(minute) + "分" + unitFormat(second) + "秒";
            }
        }
        return timeStr;
    }

    public static String unitFormat(int i) {
        String retStr = null;
        if (i >= 0 && i < 10)
            retStr = "0" + Integer.toString(i);
        else
            retStr = "" + i;
        return retStr;
    }

}
