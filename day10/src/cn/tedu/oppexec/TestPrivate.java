package cn.tedu.oppexec;

/*本类用于练习面向对象继承的私有资源问题*/
public class TestPrivate {
    public static void main(String[] args) {
        Son s = new Son();
        System.out.println(s.a);
        System.out.println();
    }
}

class Father {
    int a = 10;
    private int b = 20;
}

class Son extends Father {
    int c = 30;
}
