package cn.tedu.oop;
/*本类用于测试多态成员的使用情况*/
public class TestDemo2 {
    public static void main(String[] args) {
//        Dog2 d = new Dog2();
//        System.out.println(d.sum);
//        d.eat();
//        d.play();

        /*父类引用指向子类对象,编译看左边,运行看右边*/
        /*多态中,成员变量使用的是父类的*/
        /*多态中,方法的声明使用的是父类的,方法的实现使用的是子类的*/
        Animal2 a = new Dog2();
        //a.play();
        /*多态中,如果父子类都有同名的静态方法,使用的是父类的
        * 因为多态对象把自己看作是父类型,直接使用父类的静态资源*/
    }
}

class Animal2 {
    int sum = 10;
    public void eat() {
        System.out.println("吃啥都行~");
    }
    public static void play() {
        System.out.println("玩啥都行~");
    }
}
/*1.多态的前提:继承＋重写*/
class Dog2 extends Animal2{
    {
        super.play();
        System.out.println("子类构造代码块");
    }
    static {
        System.out.println("子类静态构造代码块");
    }
    int sum = 20;
    @Override/*此注解表示当前是一个重写的方法*/
    public void eat() {
        System.out.println("小狗要吃肉包子~");
    }
    /*这不是一个重写的方法,只是恰巧在两个类中出现了一模一样的,
    静态方法属于类资源,压根不存在重写的现象
    * 所以,在那个类里定义,就在哪个类里使用*/
    public static void play() {
        System.out.println("小狗玩皮球~");
    }
}