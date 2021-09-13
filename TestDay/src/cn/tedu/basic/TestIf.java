package cn.tedu.basic;

import java.util.Scanner;

/*本类用于复习分支结构*/
public class TestIf {
    public static void main(String[] args) {

    }

    /*如果if后的语句只有一句,大括号可以省略不写
    return关键字除了可以帮我们返回方法的返回值以外,还可以直接结束当前的方法,
    * 如果遇到return,本方法会直接结束*/
    public static void ret() {
        System.out.println(1);
        int a = new Scanner(System.in).nextInt();
        if (a==1) return;
        System.out.println(a);
    }
}