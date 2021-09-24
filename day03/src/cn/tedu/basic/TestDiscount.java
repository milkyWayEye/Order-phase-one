package cn.tedu.basic;

import java.util.Scanner;

/** 本类用于练习嵌套分支的商品打折案例 */
public class TestDiscount {
	public static void main(String[] args) {
		System.out.println("请您输入商品的原价:");
		Scanner sc = new Scanner(System.in);
		double price = sc.nextDouble();
		sc.close();
		double count = price;
		if(price >= 10000) {
			count = price * 0.5;
		}else if(price >= 5000){
			count = price * 0.7;
		}else if(price >= 3000){
			count = price * 0.8;
		}else if(price >= 1000){
			count = price * 0.9;
		}
		System.out.println("您的原价是:" + price + "需要支付的实际价格为:" + count);
	}
}
