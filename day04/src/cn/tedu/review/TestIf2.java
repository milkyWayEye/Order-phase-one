package cn.tedu.review;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.util.Scanner;

/**本类用于测试嵌套分支*/
public class TestIf2 {
    public static void main(String[] args) {
        //需求:接收用户的身高和体重,计算用户的BMI指数
        //计算公式: 体重/身高²,得到的结果按如下输出:
        //<18.5过轻   <=22.9正常    <=24.9偏胖    <=40重度肥胖    更大的就是极度肥胖
        System.out.println("请输入您的身高:");
        double h = new Scanner(System.in).nextDouble();
        System.out.println("请输入您的体重(单位为KG)");
        double w = new Scanner(System.in).nextDouble();

        double bmi = w / (h * h);
        if (bmi < 18.5) {
            System.out.println("过轻");
        }else if (bmi <= 22.9) {
            System.out.println("正常");
        }else if (bmi <= 24.9) {
            System.out.println("偏胖");
        }else if (bmi<=40) {
            System.out.println("重度肥胖");
        }else {
            System.out.println("极度肥胖");
        }
    }
}
