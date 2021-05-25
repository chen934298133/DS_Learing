package LeetCode_2021.Coding_2021_05_25;

import java.util.HashMap;
import java.util.Map;

public class offer20 {
    public boolean isNumber(String s) {
        // 建立状态机
        // 0. 开始的空格
        // 1. 幂符号前的正负号
        // 2. 小数点前的数字
        // 3. 小数点、小数点后的数字
        // 4. 当小数点前为空格时，小数点、小数点后的数字
        // 5. 幂符号
        // 6. 幂符号后的正负号
        // 7. 幂符号后的数字
        // 8. 结尾的空格

        // 每个状态机的下标即为状态机标识,内部map放着此状态合法的后续状态走向
        Map[] states = {
                // 0（空格）状态 后可能走向 0（空格），1（符号），2（数字），4（小数点）
                new HashMap<Object, Object>() {{
                    put(' ', 0);
                    put('s', 1);
                    put('d', 2);
                    put('.', 4);
                }},
                // 1（符号）状态 后可能走向 2（数字），4（小数点）
                new HashMap<Object, Object>() {{
                    put('d', 2);
                    put('.', 4);
                }},
                // 2（小数点前的数字）状态 后可能走向 2（数字），3（小数点之后的数字），4（小数点），8（结尾空格）
                new HashMap<Object, Object>() {{
                    put('d', 2);
                    put('.', 3);
                    put('e', 5);
                    put(' ', 8);
                }},
                // 3（小数点之后的数字）状态 后可能走向 3（数字），5（幂符号），8（结尾空格）
                new HashMap<Object, Object>() {{
                    put('d', 3);
                    put('e', 5);
                    put(' ', 8);
                }},
                // 4（当前面空格时的小数点）状态，后可能走向 3（数字）
                new HashMap<Object, Object>() {{
                    put('d', 3);
                }},
                // 5（幂符号） 状态 ，后可能走向 6（幂符号后的正负号），7（幂符号后的数字）
                new HashMap<Object, Object>() {{
                    put('s', 6);
                    put('d', 7);
                }},
                // 6（幂符号后的正负号），后可能走向 7（幂符号后的数字）
                new HashMap<Object, Object>() {{
                    put('d', 7);
                }},
                // 7（幂符号后的数字），后可能走向 7（幂符号后的数字）
                new HashMap<Object, Object>() {{
                    put('d', 7);
                    put(' ', 8);
                }},
                // 8 （结尾的空格） 后可能走向 8（多余的空格），
                new HashMap<Object, Object>() {{
                    put(' ', 8);
                }}
        };
        int p = 0;
        char t;
        // 将字符串转为字符数组逐个遍历，
        for (char c : s.toCharArray()) {
            if (c >= '0' && c <= '9') t = 'd';
            else if (c == '+' || c == '-') t = 's';
            else if (c == 'e' || c == 'E') t = 'e';
            else if (c == '.' || c == ' ') t = c;
            else t = '?';
            if (!states[p].containsKey(t)) return false;
            p = (int) states[p].get(t);
        }
        return p == 2 || p == 3 || p == 7 || p == 8;
    }

    public boolean isNumber1(String s) {

        // s为空对象或 s长度为0(空字符串)时, 不能表示数值
        if (s == null || s.length() == 0) return false;

        // 标记是否遇到数位、小数点、‘e’或'E'
        boolean isNum = false, isDot = false, ise_or_E = false;

        // 删除字符串头尾的空格，转为字符数组，方便遍历判断每个字符
        char[] str = s.trim().toCharArray();

        for (int i = 0; i < str.length; i++) {
            // 判断当前字符是否为 0~9 的数位
            if (str[i] >= '0' && str[i] <= '9') isNum = true;
                // 遇到小数点
            else if (str[i] == '.') {
                // 小数点之前可以没有整数，但是不能重复出现小数点、或出现‘e’、'E'
                if (isDot || ise_or_E) return false;
                // 标记已经遇到小数点
                isDot = true;

                // 遇到‘e’或'E'
            } else if (str[i] == 'e' || str[i] == 'E') {
                // ‘e’或'E'前面必须有整数，且前面不能重复出现‘e’或'E'
                if (!isNum || ise_or_E) return false;
                // 标记已经遇到‘e’或'E'
                ise_or_E = true;
                // 重置isNum，因为‘e’或'E'之后也必须接上整数，防止出现 123e或者123e+的非法情况
                isNum = false;
            } else if (str[i] == '-' || str[i] == '+') {
                // 正负号只可能出现在第一个位置，或者出现在‘e’或'E'的后面一个位置
                if (i != 0 && str[i - 1] != 'e' && str[i - 1] != 'E')
                    return false;
                // 其它情况均为不合法字符
            } else return false;
        }
        return isNum;
    }

    public static void main(String[] args) {

    }
}
