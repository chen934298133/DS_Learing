package Reflection;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

// 通过反射获取泛型
public class Test08 {
    public void test01(Map<String, Person> map, List<Person> list){
        System.out.println("test01");
    }

    public Map<String, Person> test02(){
        System.out.println("test02");
        return null;
    }

    public static void main(String[] args) throws NoSuchMethodException {

        
        Method method = Test08.class.getMethod("test01", Map.class, List.class);

        // getGenericParameterTypes 获得泛型的参数类型
        Type[] genericParameterTypes = method.getGenericParameterTypes();

//        System.out.println(Arrays.toString(genericParameterTypes));

        for (Type genericParameterType : genericParameterTypes){
            System.out.println("# " + genericParameterType);
            // 判断是否是参数化类型
            if (genericParameterType instanceof ParameterizedType){
                // getActualTypeArguments 获得真是类型
                Type[] actualTypeArguments = ((ParameterizedType) genericParameterType).getActualTypeArguments();
                for (Type actualTypeArgument: actualTypeArguments){
                    System.out.println(actualTypeArgument);
                }
            }
        }




    }
}
