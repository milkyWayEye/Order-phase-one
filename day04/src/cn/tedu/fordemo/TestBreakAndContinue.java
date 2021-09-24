package cn.tedu.fordemo;

import java.util.Scanner;

/**
 * 本类用于关键字break与continue的测试
 */
/**continue与break后都不可以加代码,因为都是不可到达的代码*/
public class TestBreakAndContinue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int num = Math.random()
//        System.out.println(Math.random());
        int num = (int)(Math.random()*100+1);
        System.out.println(num);
        for (int i = 0; i < 100; i++) {
            System.out.println("请输入你猜的数字:");
            int input = sc.nextInt();
            if (input == num) {
                System.out.println("猜对了");
                break;
            } else if (input < num) {
                System.out.println("猜小了");
            } else if (input > num) {
                System.out.println("猜大了");
            }
        }
        sc.close();
    }
}
