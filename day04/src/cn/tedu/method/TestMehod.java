package cn.tedu.method;
/**本类用于创建*/
public class TestMehod {
    public static void main(String[] args) {
        method1();
        method2(45);
        method3(2,5);
        method4("张三",2.7);
    }
    private static void method4(String name,double num) {
        System.out.println(name+"今晚要吃"+num+"碗大米饭");
    }

    private static void method3(int i, int j) {
        System.out.println(i*j);
    }

    private static void method2(int n) {
        System.out.println("海绵宝宝今年"+n+"岁了");
    }

    private static void method1() {
        System.out.println(4);
        System.out.println(6);
        System.out.println(8);
    }
}
