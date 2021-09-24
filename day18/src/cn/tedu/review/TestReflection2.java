package cn.tedu.review;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*本类用于练习暴力反射*/
public class TestReflection2 {
    /*1.通过暴力反射获取与操作属性*/
    @Test
    public void getFie2() throws NoSuchFieldException, IllegalAccessException, InstantiationException {
        Class<Person> clazz = Person.class;
        //2.获取指定私有属性,传入的是属性名,注意抛出异常
        Field field = clazz.getDeclaredField("name");
        //3.根据刚刚获取到的属性对象,查看属性的信息
        System.out.println(field.getType().getName());
        System.out.println(field.getType());
        System.out.println(field);
        //4.设置属性的值
        //4.1需要指定到底是给哪个对象的name属性设置值
        Object obj = clazz.newInstance();//触发无参构造利用反射创建对象

        field.setAccessible(true);
        //通过字段对象给刚刚创建好的对象obj设置属性值
        field.set(obj,"海绵宝宝");

        //打印查看刚刚设置的属性值
        //field.get(m)--field代表的就是Person类的name属性,m是查看哪个对象的这个属性值
        System.out.println(field.get(obj));
    }

    @Test
    public void getFie3() throws NoSuchFieldException, IllegalAccessException, InstantiationException {
        Class<Person> clazz = Person.class;
        Field f = clazz.getDeclaredField("age");
        Object obj = clazz.newInstance();
        f.setAccessible(true);
        //t.3通过刚刚获取到的age属性对象,给obj对象设置值
        f.set(obj,17);
        System.out.println(f.get(obj));
    }

    //创建单元测试方法,通过暴力反射获取与执行Person类的私有方法
    @Test
    public void getFunction2() throws NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Class<Person> clazz = Person.class;
        //2.可以通过字节码对象获取某一个指定的私有方法对象
        //如何确定要找哪个方法?方法名+参数列表
        Method method = clazz.getDeclaredMethod("save", int.class, String.class);

        /*在执行私有的方法之前,需要设置私有 可见的权限*/
        method.setAccessible(true);
        //3.在执行获取到的方法之前,需要先指定给哪个对象做这个save()操作
        //3.1没有对象就创建对象
        Object obj = clazz.newInstance();
        //3.2通过刚刚获得的方法对象method给指定的对象obj做操作,注意传参
        //底层会调用obj对象的save方法,传入参数666与"哈哈哈"
        method.invoke(obj,666,"哈哈哈");
    }

}
