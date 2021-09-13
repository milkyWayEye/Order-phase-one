package cn.tedu.oop2;
/*本类用于测试抽象类中构造函数的使用*/
/*抽象类中是否有构造方法?可以
* 既然抽象类不能实例化,为什么要有构造方法呢?
* 不是为了自己使用,而是为了子类创建对象时使用super()*/
public class AbstractDemo2 {
    public static void main(String[] args) {
        Pig2 p = new Pig2();
    }
}

abstract class Animal2 {
    public Animal2() {
        System.out.println("我是Animal2抽象类的无参构造");
    }
}

class Pig2 extends Animal2 {
    public Pig2() {
        System.out.println("我是Pig2子类的无参构造");
    }
}