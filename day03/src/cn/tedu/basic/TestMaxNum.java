package cn.tedu.basic;

import java.util.Scanner;

/**本类用于练习求两个数的最大值*/
public class TestMaxNum {
	public static void main(String[] args) {
		//1.提示并接收用户输入的两个整数
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入两个整数:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		//2.比较出这两个数的最大值
		int max = a>b ? a : b;
		//3.将比较的结果输出到控制台
		System.out.println("最大的数为:"+max);
	}
}
