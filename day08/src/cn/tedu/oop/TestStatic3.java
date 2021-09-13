package cn.tedu.oop;
/*本类用来测试静态代码块*/
/*执行顺序:静态代码块 构造代码块 构造方法 普通方法 局部代码块*/
public class TestStatic3 {
    public static void main(String[] args) {
        Person p = new Person();
        p.play();
        Person p2 = new Person();
    }
}

class Person{
    static {
        /*/静态代码块static {}
        * 1.位置:类里方法外
        * 2.执行时机:静态代码块也属于静态资源,随着类的加载而加载,优先于对象进行加载
        *           并且只加载一次
        * 3.作用:用于加载那些需要第一时间就加载,并且只需要加载一次的资源,常用来初始化*/
        System.out.println("我是一个静态代码块");
    }
    {
        System.out.println("我是一个构造代码块");
    }
    public Person() {
        System.out.println("我是一个无参构造方法");
    }
    public void play() {
        System.out.println("我是一个普通方法");
        {
            System.out.println("我是一个局部代码块");
        }
    }
}
