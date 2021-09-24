package cn.tedu.review;

import java.util.Scanner;

/**本类用于复习分支结构*/
public class TestIf {
    public static void main(String[] args) {
        /**单分支结构*/
        int a = 100;
        if (a > 50 && a<=100) {
            System.out.println("满50");
        }
        if (a>30 && a<=50) {
            System.out.println("满30");
        }
        if (a > 30 )
        /**2.单分支结构*/
        //1.接收用户在键盘输入的代码行数,判断用户的代码熟练度
        System.out.println("请输入代码的行数:");
        int num = new Scanner(System.in).nextInt();
        if (num >= 70000) {
            System.out.println("恭喜你,高薪OFFER正在等待你!");
        } else {
            System.out.println("请再接再厉");
        }
        int i = 1;
        for (;i<0;i++) {

        }
    }
}
