package cn.tedu.basic;

import java.util.Scanner;

/**本类用于求圆形的面积*/
public class TestCircleArea {
	public static void main(String[] args) {
		//定义一个变量用来保存圆的半径
		double r;
		r = new Scanner(System.in).nextDouble();
		//求出圆的面积
		double circleArea = 3.14*r*r;
		System.out.println(circleArea);
	}
}
