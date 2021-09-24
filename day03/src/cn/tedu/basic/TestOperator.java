package cn.tedu.basic;
/**本类用于测试取余运算符*/
public class TestOperator {
	public static void main(String[] args) {
		/**1.基本的四则运算符 + - * / */
		//1.测试除法与取余数
		System.out.println(35/10);//3,int/int->int
		/**2.%是一个取余符号,余数为几,运算结果就是几
		 * 整除的话,取余的结果就是0*/
		System.out.println(35%10);//5
		
		//2.练习:求一个两位数的十位与个位
		int x = 59;
		System.out.println(x/10);//5,打印十位
		System.out.println(x%10);//9,打印个位
		
		//3.练习,求一个三位数的百位,十位与个位;
		int y = 159;
		System.out.println(y/100);
		System.out.println(y/10%10);
		System.out.println(y%10);
	}
}
