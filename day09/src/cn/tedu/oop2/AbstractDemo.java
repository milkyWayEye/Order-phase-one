package cn.tedu.oop2;

/*本类用作抽象的入门案例*/
public class AbstractDemo {
    public static void main(String[] args) {
        /*5.抽象类不可以创建对象*/
        //Animal a = new Animal();//会报错
        Pig p = new Pig();
        Animal a2 = new Pig();
        a2.eat();//调用的是父类普通方法
        a2.play();
        a2.fly();//调用的是抽象父类的声明,普通子类的具体实现
        a2.fly2();
    }
}

/*1.如果一个类中包含了抽象方法,那么这个类必须被声明成抽象类
 * 抽象类:被abstract关键字修饰的类*/
abstract class Animal {
    /*2.被abstract修饰的方法时抽象方法,并且抽象方法没有方法体*/
    public abstract void fly();

    public abstract void fly2();

    /*抽象类里可以有普通方法*/
    public void eat() {
        System.out.println("吃啥都行");
    }

    public void play() {
        System.out.println("飞");
    }
    /*3.抽象类里可以有:全普 / 全抽 / 半普半抽,方法不做限制*/
}

/*4.当一个子类继承了一个抽象父类以后,有两种解决方案:
 * 方案一:变成抽象子类,"躺平",我也不实现,继续抽象
 * 方案二:实现抽象父类中的所有的抽象方法,"父债子偿"*/
//abstract class Pig extends Animal {//方案一
//
//}
class Pig extends Animal {

    @Override
    public void fly() {
        System.out.println("我爸的债我终于还清了,我家的猪终于飞起来了~");
    }

    @Override
    public void fly2() {
        System.out.println("抽象父类的所有抽象方法都需要实现,子类才能是普通类");
    }
}