package cn.tedu.oop;
/*本类用于测试静态的调用关系*/
/*静态只能调用静态*/
public class TestStatic2 {
}

class Teacher {
    String name;
    static int age;

    public void ready() {
        System.out.println("正在备课中...");
        /*普通资源能否调用静态资源?可以*/
        System.out.println(age);
        teach();
    }

    public static void teach() {
        /*2.静态资源能否调用普通资源?不可以*/
        System.out.println("正在授课中...");
    }

    public static void eat() {
        System.out.println("先吃饭~");
        /*静态资源能否调用静态资源?可以*/
        System.out.println(age);
        teach();
    }
}
