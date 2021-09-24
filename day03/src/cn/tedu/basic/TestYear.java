package cn.tedu.basic;

import java.util.Scanner;

/**本类用于运算符的综合练习*/
public class TestYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入年份");
		int year = sc.nextInt();
		sc.close();
		boolean isRun = year%4 == 0 && year%100 != 0 || year%400 ==0;
		System.out.println(isRun?"闰年":"平年");
	}
}