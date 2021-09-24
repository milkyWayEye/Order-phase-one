package cn.tedu.review;

import org.junit.Test;

import java.lang.reflect.Field;

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

}
