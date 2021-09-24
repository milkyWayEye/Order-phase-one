package cn.tedu.basic;

import java.util.Scanner;

/** 本类用于练习分支结构,求学员的分数段位 */
public class TestScore {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// sc.close();
		// if(score < 0 || score > 100 ||
		// ((Object)score).getClass().toString()!="int"){
		// System.out.println("输入数据无效,请重新输入");
		// }else{
		//
		// }
		while (true) {
			System.out.println("请输入学员的成绩:");
			int score = sc.nextInt();
			if (score == 111) {
				System.out.println("byebye");
				break;
			} else if (score < 0 || score > 100) {
				System.out.println("输入数据无效,请重新输入");
			} else {
				if (score >= 90) {
					System.out.println("最强王者");
				} else if (score >= 80) {
					System.out.println("至尊星耀");
				} else if (score >= 70) {
					System.out.println("永恒钻石");
				} else if (score >= 60) {
					System.out.println("尊贵铂金");
				} else if (score == 111) {
					break;
				} else {
					System.out.println("快看!这儿有个青铜");
				}
			}
		}
		sc.close();
	}
}
