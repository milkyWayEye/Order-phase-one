package cn.tedu.oop;
/*本类用于测试final关键字*/
public class TestFinal {
    public static void main(String[] args) {
        Son s = new Son();
        System.out.println(s.a);
    }
}
/*1.final可以用来修饰类吗?可以
* 被final修饰的类是最终类,不可以被继承
* 可以把被final修饰的类看成树结构中的叶子节点*/
class Father {
    /*2.final可以用来修饰方法吗?可以
    * 被final修饰的方法是这个方法的最终实现,不可以被重写*/
    public final void work() {
        System.out.println();
    }
    public void work(int a) {
        final int b = 2;
    }
}

class Son extends Father {
    /*3.final可以用来修饰变量吗?可以
    * 被final修饰的变量会被当做常量,无法被修改
    * 注意:定义常量时必须赋值*/
    final int a = 5;
    @Override
    public void work(int a) {}
}

