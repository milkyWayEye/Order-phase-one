package cn.tedu.basic;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**本类用于练习while循环*/
public class TestWhile {
    public static void main(String[] args) {
        int r=new Random().nextInt(10);
        System.out.println(r);
        guessNum(r);
    }

    private static void guessNum(int r) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入你的答案:");
            try {
                int a = sc.nextInt();
                if (a==r) {
                    System.out.println("猜对了");
                    break;
                }
                if (a>r) {
                    System.out.println("猜大啦");
                } else {
                    System.out.println("猜小了");
                }
            } catch (InputMismatchException e) {
                System.out.println("输入数据类型错误,请重新输入:");
                sc.nextLine();
            }
        }
    }
}
