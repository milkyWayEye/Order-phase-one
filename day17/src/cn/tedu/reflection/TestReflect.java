package cn.tedu.reflection;
/*本类用于测试反射*/

import org.junit.Test;

import javax.sound.midi.Soundbank;
import java.lang.reflect.Method;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class TestReflect {
    //1.创建程序的入口函数main()--不用
    /*单元测试方法:是Java中最小的测试单位,使用灵活,推荐指数:5颗星
     * 语法要求:@Test+public+void+没有参数
     * 注意:使用时需要导包:Add JUnit 4 library
     * */
    //2.通过单元测试方法获取类的字节码对象
    @Test
    public void getClazz() throws ClassNotFoundException {
        //此方法的参数是类的全路径:包名.类名,注意抛出异常
        Class<?> clazz1 = Class.forName("cn.tedu.reflection.Student");
        Class<?> clazz2 = Student.class;
        Class<?> clazz3 = new Student().getClass();

        System.out.println(clazz1);//打印的是刚刚反射获取到的字节码对象
        System.out.println(clazz2.getName());//打印的是当前字节码对象的全路径名
        System.out.println(clazz3.getSimpleName());//只获取类名
        System.out.println(clazz1.getPackage());
        System.out.println(clazz2.getPackage().getName());
    }
    //3.通过单元测试方法获取Student类中的方法
    @Test
    public void getFunction() {
        //1.
        Class<?> clazz = Student.class;
        //2.通过字节码对象获取目标类的成员方法
        Method[] methods = clazz.getMethods();
        //查看每个方法的信息
        System.out.println(Arrays.toString(methods));
        for (Method m: methods) {
            //通过每轮循环遍历到的方法对象,获取方法的各种信息
            System.out.println(m.getName());//获取方法名
            Class<?>[] parameterTypes = m.getParameterTypes();//获取方法的参数类型
            System.out.println(Arrays.toString(parameterTypes));
        }
    }
}
