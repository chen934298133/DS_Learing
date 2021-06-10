package LeetCode_2021.Coding_2021_06_10;

import com.sun.xml.internal.messaging.saaj.util.Base64;

public class byteTest {
    public static void main(String[] args) {
        byte[] b = {23, 113, 0, 2, 0, 0, 23, 114, 0, 1, 2, 23, 115, 0, 1, 0, 23, -124, 0, 1, 0, 23, -123, 0, 1, -1, 23, -122, 0, 2, 0, 15, 23, 116, 0, 1, 100, 23, 117, 0, 15, 56, 54, 54, 57, 55, 49, 48, 51, 49, 56, 48, 52, 51, 50, 54, 23, 118, 0, 15, 52, 54, 48, 48, 52, 51, 49, 57, 50, 54, 48, 49, 52, 48, 51, 23, 119, 0, 2, -1, -82};
        for (byte b1 : b) {
            System.out.print(b1 + "  ");
//            System.out.println((int) b1);
            System.out.println(byteToInt(b1));
        }
        System.out.println(byteArrayToInt(b));

        //Convert back to String
        String s = new String(b);

        //Check converted string against original String
        System.out.println("Decoded String : " + s);
//        byte[] data = new byte[b.size]

        System.out.println();
    }

    public static int byteToInt(byte b) {
        //Java 总是把 byte 当做有符处理；我们可以通过将其和 0xFF 进行二进制与得到它的无符值
        return b & 0xFF;
    }

    public static int byteArrayToInt(byte[] bytes) {
        int value = 0;
        // 由高位到低位
        for (int i = 0; i < 4; i++) {
            int shift = (4 - 1 - i) * 8;
            value += (bytes[i] & 0x000000FF) << shift;// 往高位游
        }
        return value;
    }
}
