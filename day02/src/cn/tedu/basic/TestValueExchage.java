package cn.tedu.basic;

import java.util.Scanner;

public class TestValueExchage {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个整数:");
		int a = sc.nextInt();
		System.out.println("请输入第二个整数:");
		int b = sc.nextInt();
		sc.close();
		int c = a;
		a = b;
		b = c;
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
}
