package cn.tedu.review;
/**本类用于方法的回顾*/

import java.util.Scanner;

/**1.方法的格式:修饰符 返回值类型 方法名(参数列表) {方法体}*/
public class TestMethod {
    public static void main(String[] args) {
        get(5);
        calc();
    }

    private static void calc() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请您输入要计算的第一个数:");
        int a = sc.nextInt();
        System.out.println("请您输入要计算的第二个数:");
        int b = sc.nextInt();
        System.out.println("请您输入操作符:");
        String operator = sc.next();
        switch (operator) {
            case "+":
                System.out.println(String.format("%d%s%d=%d",a,operator,b,a+b));
                break;
            case "-":
                System.out.println(String.format("%d%s%d=%d",a,operator,b,a-b));
                break;
            case "*":
                System.out.println(String.format("%d%s%d=%d",a,operator,b,a*b));
                break;
            case "/":
                System.out.println(String.format("%d%s%d=%d",a,operator,b,a/b));
                break;
            default:
                System.out.println("输入错误,请输入操作符");
        }
    }

    private static void get(int i) {
        System.out.println(i*i);
    }


}
