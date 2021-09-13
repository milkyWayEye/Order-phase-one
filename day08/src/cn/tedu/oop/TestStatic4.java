package cn.tedu.oop;
/*本类用来测试父子静态*/
/*父类静态代码块 子类静态代码块 父类构造代码块 父类构造方法 父类普通方法 父类局部代码块
* 子类构造代码块 子类构造方法 子类普通方法 子类局部代码块*/
public class TestStatic4 {
    public static void main(String[] args) {
        new Father4();
        new Son4();
    }
}

class Father4 {
    {
        System.out.println("我是父类的构造代码块");
    }
    static {
        System.out.println("我是父类的静态代码块");
    }
    public Father4() {
        super();
        System.out.println("我是父类的构造方法");
    }
}

class Son4 extends Father4{
    static int a = 1;
    {
        System.out.println("我是子类的构造代码块");
    }
    static {
        System.out.println("我是子类的静态代码块");
    }
    public Son4() {
        System.out.println("我是子类的构造方法");
    }
}