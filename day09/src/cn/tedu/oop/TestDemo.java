package cn.tedu.oop;
/*本类用作多态的入门案例*/
public class TestDemo {
    public static void main(String[] args) {
        Animal a = new Animal();
        Cat c = new Cat();
        Dog d = new Dog();
        a.eat();
        c.eat();
        d.eat();
        /*2.父类不能调用子类的特有功能*/
        c.jump();
        d.run();

        /*3.口诀1:父类引用指向子类对象
        * 解释:创建出来的子类对象的地址值,交给父类类型的引用类型变量来保存*/
        Animal a2 = new Cat();
        Animal a3 = new Dog();
        a2.eat();
        a3.eat();
        /*4.口诀2:编译看左边,运行看右边
        * 解释:必须要在父类里定义这个方法,才能通过编译,编译时,把多态对象看作是父类类型
        * 必须要在子类中重写父类定义的这个方法,运行时,方法体使用的是子类的功能*/
    }
}

/*1.多态的前提:继承＋重写*/

class Animal {
    public void eat() {
        System.out.println("小动物Animal吃啥都行~");
    }
}

class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("小猫爱吃小鱼干~");
    }
    public void jump() {
        System.out.println("小猫Cat跳的老高啦~");
    }
}

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("小狗爱吃肉骨头~");
    }
    public void run() {
        System.out.println("小狗Dog跑的老快了");
    }
}