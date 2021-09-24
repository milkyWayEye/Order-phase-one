package cn.tedu.basic;

import java.util.Random;

/**
 * 本类用于练习do-while循环
 */
public class TestDoWhile {
    public static void main(String[] args) {
        int n;
        do {
            System.out.println("我是循环体");
            n = new Random().nextInt(10);
            System.out.println(n);
        } while (n>5);
    }
}
