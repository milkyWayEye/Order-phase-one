package cn.tedu.fordemo;

/**
 * 本类用于测试完成99乘法表
 */
public class Test99Excel {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print(j + "*" + i + "=" + i * j + "\t");
            }
            System.out.println();
        }
    }
}
