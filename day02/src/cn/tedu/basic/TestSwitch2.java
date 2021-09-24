package cn.tedu.basic;

import java.util.Scanner;

/** 本类用于switch结构的巩固练习 */
public class TestSwitch2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();

		switch (s) {
		case "星期一":
			System.out.println("星期一吃火锅");
			break;
		case "星期二":
			System.out.println("星期二吃小龙虾");
			break;
		case "星期三":
			System.out.println("星期三吃海鲜粥");
			break;
		case "星期四":
			System.out.println("星期四吃热干面");
			break;
		case "星期五":
			System.out.println("星期五吃南昌拌粉");
			break;
		case "星期六":
			System.out.println("星期六吃兰州拉面");
			break;
		case "星期日":
			System.out.println("星期日吃胡辣汤");
			break;

		default:
			System.out.println("想吃啥吃点啥吧");
		}
	}
}
