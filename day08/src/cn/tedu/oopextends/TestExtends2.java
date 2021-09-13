package cn.tedu.oopextends;
/*本类用于测试继承中构造方法的使用*/
/*1.子类在创建对象时,默认会先调用父类的构造方法
* 2.原因时子类的构造函数中第一行默认存在super()--表示调用父类的无参构造
* 3.当父类没有无参构造是,可以通过super(参数)调用父类的其他含参构造
* 但不可以不调用任何一个父类的构造函数,必须选一个来调用
* 4.构造方法不可以被继承!因为语法的原因:构造方法名是类名,子类里不能写一个父类名字
* 的构造方法*/
public class TestExtends2 {
    public static void main(String[] args) {
        Son2 s = new Son2();
    }
}

class Father2 {
    public Father2() {
        System.out.println("我是Father2的无参构造~");
    }
    public Father2(String s) {
        System.out.println("我是Father2的含参构造"+s);
    }
}

class Son2 extends Father2 {
    public Son2() {
        System.out.println("我是Son2的无参构造!");
    }
}
