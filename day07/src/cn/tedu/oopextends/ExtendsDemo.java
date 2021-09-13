package cn.tedu.oopextends;

import javax.crypto.spec.PSource;

/**本类用作继承的入门案例*/
public class ExtendsDemo {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();
        Cat c = new Cat();
        c.eat();
        DingDang d = new DingDang();
        d.eat();
        /*3.继承具有传递性,爷爷的功能会传给爸爸,爸爸的功能会传给孙子*/
    }
}
/*1.我们通过extends关键字建立子类与父类的继承关系,格式:子类 extends 父类*/
/*2.Java只支持单继承:一个子类只能有一个父类,但是一个父类可以有多个子类*/
class Animal {
    public void eat() {
        System.out.println("小动物Animal吃啥都行~");
    }
}
/*6.继承是一种is a的关系,是一种依赖性非常强,强耦合的关系
* 解决方案:解耦*/
class Cat extends Animal{
    int a = 10;
    private int b = 100;
    public void eat() {
        System.out.println("ss");
    }
}

class MiaoMiao extends Cat {
    /*4.子类可以有自己的方法*/
    public void study() {
        System.out.println("正在学java");
        /*5.子类只可以使用父类的非私有资源
        * 注意:这个私有资源是由于子类不可见而不能使用的,不是因为没有继承过来
        * 因为被private修饰的资源只能在本类中访问
        * 而且继承的时候,相当于把父类的资源复制了一份,包括私有资源*/
        System.out.println(a);
    }
}

class DingDang extends Cat {

}
