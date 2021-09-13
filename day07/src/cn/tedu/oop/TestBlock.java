package cn.tedu.oop;

/**
 * 本类用于测试代码块
 */
/*构造方法1 构造代码块2 普通方法3 对象创建成功4 局部代码块5
* 1.当创建对象时,会触发构造函数
* 2.创建对象时,也会出发构造代码块,而且构造代码块优先于构造方法执行的
* 3.我们通过创建好的对象来调用普通的方法
* 4.如果调用的普通方法里有局部代码块,对应的局部代码块才会执行
* 21435
* */
public class TestBlock {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        Cat c2 = new Cat("缅因猫");
        System.out.println(c1.food+c2.food);
        c1.jump();
    }
}

class Cat {
    String food;

    {
        /*构造代码块
        * 1.位置:类里方法外
        * 2.执行时机:每次创建对象时,都会执行构造代码块,并且构造代码块优先于构造方法执行
        * 3.作用:*/
        food = "小鱼干";
        System.out.println("我是一个构造代码块");
    }

    public Cat() {
        System.out.println("我是Cat类的无参构造");
    }
    public Cat(String s) {
        System.out.println("我时Cat类的含参构造");
    }


    public void jump() {
        System.out.println("小猫Cat跳的老高啦~");
        {
            /*局部代码块:{}
            * 1.位置:方法里
            * 2.执行时机:调用本局部代码块所处的方法时才会执行
            * 3.作用:控制变量的作用范围,变量的作用范围要越小越好*/
            System.out.println("我是一个局部代码块");
        }
    }
}