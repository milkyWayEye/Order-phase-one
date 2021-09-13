package cn.tedu.review;

import java.util.Scanner;

public class TestException {
    public static void main(String[] args) {
        method2();
        method3();
    }

    private static void method3() {
        System.out.println("输入第一个数:");
        int a = new Scanner(System.in).nextInt();
        System.out.println("输入第二个数:");
        int b = new Scanner(System.in).nextInt();
        System.out.println(a/b);
    }

    private static void method2() {
        try {
            System.out.println("输入第一个数:");
            int a = new Scanner(System.in).nextInt();
            System.out.println("输入第二个数:");
            int b = new Scanner(System.in).nextInt();
            System.out.println(a/b);
        } catch (Exception e) {
            System.out.println("输入数据错误,清重新输入");
        }
    }
}
