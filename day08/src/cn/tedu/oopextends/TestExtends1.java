package cn.tedu.oopextends;

public class TestExtends1 {
    public static void main(String[] args) {
        Son s = new Son();
        s.study();
    }
}

class Father {
    int sum = 1;
    int count = 2;
}

class Son extends Father {
    int sum = 10;

    public void study() {
        int sum = 100;
        System.out.println("好好学习 天天向上");
        System.out.println(sum);
        System.out.println(this.sum);
        System.out.println(count);
        /*当父类与子类的成员变量同名的时候,可以使用super指定父类的成员变量
        * 我们可以把super看做是父类的对象:Father super = new Father();*/
        System.out.println(super.sum);
    }
}
