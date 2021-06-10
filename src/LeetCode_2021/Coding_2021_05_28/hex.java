package LeetCode_2021.Coding_2021_05_28;

import java.text.SimpleDateFormat;
import java.util.Date;

public class hex {
    public static void main(String[] args) {
        // 3B130F030615
        // 4040 0700 02FF 3B130F030615 3517000006FF 000000000000 1100 02 02 01 87 00 28 35170000 2300 3B130F030615 83 2323
        // 4040070002FF3B130F0306153517000006FF00000000000011000202018700283517000023003B130F030615832323
        String str = "4040070002FF3B130F0306153517000006FF0000000000001100020201870028D3517000023003B130F030615832323";
        str = "4040030002FF2B040A1006144B00000006FF00000000000011000202018700284B00000023002B040A1006144D2323";
//        str = "4040050002FF090B0A1006144B00000006FF00000000000011000202018700284B0000002101090B0A100614182323";
        String string = "4040020002FF1F32091006144B00000006FF00000000000022000203028700284B00000080A3FF1F32091006148700284B00000088870D1F32091006143A2323";
        // 判断是状态量包还是模拟量包

        System.out.println(getReturnHex(str));
        System.out.println(getReturnHex(string));

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

        System.out.println(Integer.parseInt("1784", 16));
        System.out.println(Integer.parseInt("0001", 16));
        System.out.println(Integer.parseInt("02", 16));
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
