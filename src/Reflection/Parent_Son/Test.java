package Reflection.Parent_Son;

import java.lang.reflect.Field;

/**
 *
 * 4、根据反射获取父类属性
 *
 * 通过执行上述代码，我们获得了父类的私有属性值，
 * 这里要注意的是直接通过反射获取子类的对象是不能得到父类的属性值的，
 * 必须根据反射获得的子类 Class 对象在调用  getSuperclass() 方法获取父类对象，
 * 然后在通过父类对象去获取父类的属性值。
 *
 */
public class Test {
    public static void main(String[] args){

    }

    public void testGetParentField() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class c1 = Class.forName("Reflection.Parent_Son.Son");
        System.out.println(getFieldValue(c1.newInstance(),"privateField"));
    }

    public static Field getDeclaredField(Object obj, String fieldName){
        Field field = null;
        Class c = obj.getClass();
        for (;c != Object.class; c = c.getSuperclass()){
            try {
                field = c.getDeclaredField(fieldName);
                field.setAccessible(true);
                return field;
            } catch (NoSuchFieldException e) {
//                e.printStackTrace();
                //这里什么都不要做！并且这里的异常必须这样写，不能抛出去。
                //如果这里的异常打印或者往外抛，则就不会执行c = c.getSuperclass(),最后就不会进入到父类中了
            }
        }
        return null;
    }

    public static Object getFieldValue(Object object, String fieldName) throws IllegalAccessException {
        Field field = getDeclaredField(object, fieldName);
        return field.get(object);
    }
}
