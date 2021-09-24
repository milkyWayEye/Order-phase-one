package cn.tedu.review;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/*本类用于反射的测试类*/
public class TestReflection {
    //通过单元测试方法:获取目标类Student对应的字节码对象
    @Test
    public void getClazz() throws ClassNotFoundException {
        Class<?> clazz1 = Class.forName("cn.tedu.review.Student");
        Class<Student> clazz2 = Student.class;
        Class<?> clazz3 = new Student().getClass();

        System.out.println(clazz1);
        System.out.println(clazz1.getName());
        System.out.println(clazz1.getSimpleName());
        System.out.println(clazz2.getPackage());
        System.out.println(clazz2.getPackage().getName());
    }

    //2.通过单元测试方法练习引用类型数组的定义与遍历
    @Test
    public void getStu(){
        //1.创建Student类的3个对象
        Student s1 = new Student("张三",3);
        Student s2 = new Student("李四",4);
        Student s3 = new Student("王五",5);

        //2.创建数组将刚刚的3个对象存入数组中
        Student[] s = {s1,s2,s3};
        System.out.println(s);
        System.out.println(Arrays.toString(s));
    }

    //3.通过单元测试方法,获取Student类中的成员方法
    @Test
    public void getFunction(){
        //1.获取字节码对象
        Class<Student> clazz = Student.class;

        //2.通过字节码对象获取目标类中的成员方法们
        Method[] ms = clazz.getMethods();

        //3.通过高效for循环遍历数组,拿到每一个方法对象
        for(Method n: ms) {
            System.out.println(n);
            System.out.println(n.getName());
            Class<?>[] pt = n.getParameterTypes();
            System.out.println(Arrays.toString(pt));
        }
    }

    //4.通过单元测试方法,获取Student类中的构造方法
    @Test
    public void  getCons() {
        Class<?> clazz = new Student().getClass();
        //2.通过字节码对象获取目标类Student的构造方法们
        Constructor<?>[] cs = clazz.getConstructors();
        //3.通过高效for循环遍历数组
        for(Constructor c:cs){
            System.out.println(c.getName());//打印本轮遍历到的构造方法的名字
            Class[] pt = c.getParameterTypes();//通过本轮遍历到的构造函数对象获取构造函数的参数类型
            System.out.println(Arrays.toString(pt));//打印参数类型
        }
    }

    //5.通过单元测试方法,获取Student类中的成员变量
    //1.获取字节码对象
    /*注意:目前成员变量的修饰符必须是public的才能获取到,不然,像默认修饰符也是获取不到的*/
    @Test
    public void getFie() throws ClassNotFoundException {
        Class<?> clazz = Class.forName("cn.tedu.review.Student");
        //2.通过字节码对象获取成员变量们
        Field[] fs = clazz.getFields();
        //3.遍历数组,获取每个成员变量的具体信息
        for(Field f:fs) {
            System.out.println(f.getName());
            System.out.println(f.getType());
        }
    }

    //6.通过单元测试方法,创建Student目标类的对象
    @Test
    public void getObject() throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class<Student> clazz = Student.class;
        //2.通过反射技术创建目标类的对象,注意抛出异常
        /*反射创建对象方案1:通过触发目标类的无参构造创建对象*/
        Student o = clazz.newInstance();
        System.out.println(o);

        /*反射创建对象2:通过触发目标类的全参构造创建对象
        * 思路:1.先获取指定的构造函数对象,注意需要指定构造函数的参数,传入的是.class字节码对象
        *     2.通过刚刚获取到的构造函数对象创建Student目标类的对象,并且给对象的属性赋值*/
        Constructor<Student> c = clazz.getConstructor(String.class, int.class);
        System.out.println(c);
        Student o1 = c.newInstance("赵六",6);
        System.out.println(o1);
    }
}
