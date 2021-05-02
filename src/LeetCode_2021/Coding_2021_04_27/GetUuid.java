package LeetCode_2021.Coding_2021_04_27;

import java.util.UUID;

public class GetUuid {


    public static String getUuid() {
        return UUID.randomUUID().toString().replaceAll("-","");
    }

    public static void main(String[] args){
        System.out.println(getUuid());
        System.out.println(getUuid());
        System.out.println(getUuid());
        System.out.println(getUuid());
        System.out.println(getUuid());
        System.out.println(UUID.randomUUID().toString());
    }
}
