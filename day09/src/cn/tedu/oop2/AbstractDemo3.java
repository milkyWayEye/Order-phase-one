package cn.tedu.oop2;
/*本类用作抽象类中的成员测试*/
public class AbstractDemo3 {
}

abstract class Animal3 {
    /*1.抽象类中可以定义成员变量吗?可以*/
    int sum = 100;
    /*2.抽象类中可以定义成员常量吗*/
    final String name = "XIAOZHUPEIQI";
    /*3.抽象类中可以有普通方法吗?可以
    * 抽象类中可以都是普通方法吗?可以
    * 抽象类中可以有抽象方法吗?可以
    * 抽象类中可以都是抽象方法吗?可以*/
    public abstract  void eat();
    public abstract void eat2();

    public String get() {
        return "乔治";
    }
    public String get2() {
        return "佩奇";
    }
}

class Fly extends Animal3{//普通子类
    @Override
    public void eat() {
        System.out.println("苍蝇不叮无缝的蛋");
    }

    @Override
    public void eat2() {
        System.out.println("苍蝇不定无缝的蛋2");
    }
}
