package LeetCode_2021.Coding_2021_05_26;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AgeParse {

    //验证完身份证的合法性
    public static void main(String[] args) throws Exception {
        String idcard15 = "130321860311519";
        String idcard18 = "111111199509010112";
        String idcard="111111199509010112";
        //自己身份证测试
        System.out.println(IdCardUtil.isValidatedAllIdcard(idcard));
        // 15位身份证
        System.out.println(IdCardUtil.isValidatedAllIdcard(idcard15));
        // 18位身份证
        System.out.println(IdCardUtil.isValidatedAllIdcard(idcard18));
        // 15位身份证转18位身份证
        System.out.println(IdCardUtil.convertIdcarBy15bit(idcard15));


        try {
            if (IdCardUtil.isValidatedAllIdcard(idcard)==false) {
                System.out.println("请输入正确的身份证！！！");
            }else {
                //获取身份证上的年月日
                String dates = idcard.substring(6, 10) + "-" + idcard.substring(10, 12) + "-" + idcard.substring(12, 14);
                Date nowDate = new Date();
                //获取当前时间
                DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                Date birthDate = df.parse(dates);
                //格式化出生日期
                long diff = nowDate.getTime() - birthDate.getTime();
                long ages = diff / (1000 * 60 * 60 * 24) / 365;

                System.out.println("您当前的年龄是："+ages);

                //获取用户年龄
                if((int)ages >= 18){
                    //判断用户年龄是否满足18周岁
                    System.out.println("您已步入成年阶段，需要承担社会责任了。");
                } else {
                    System.out.println("茁壮成长，望您早日成为国之栋梁！");
                }
            }

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }


}