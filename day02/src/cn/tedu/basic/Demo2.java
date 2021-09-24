package cn.tedu.basic;
/**本类用于测试运算规则*/
public class Demo2 {
	public static void main(String[] args) {
		/**1.运算结果的数据类型,与最大类型保持一致*/
		System.out.println(3/2f);
		
		/**2.byte short char 三种比int小的类型
		 * 运算时会先自动提升成int类型,再参与运算*/
		byte b1 = 1;
		byte b2 = 2;
		//byte b3 = b1 + b2;//int1+int2,结果复制给byte,需要强制类型转换
		System.out.println(((Object)b1).getClass().toString());
		byte be = (byte)(b1+b2);
		
		/**3.整数运算一出问题,注意:一旦溢出,数据就不正确了,需要避免*/
		//需求:已知:光每秒跑3亿米,求光跑一年的长度
		System.out.println(300000000L*60*24*365);
		
		/**4.浮点数运算不精确的现象,后续学习解决方案*/
		System.out.println(1-0.8);
		
		/**5.浮点数的特殊值*/
		//System.out.println(3/0);//报错,除数不能为0
		//System.out.println(3.14/0);//Inginity 无穷
		System.out.println(0/0.0);//NaN(Not a Number)
		
		char a = 2;
		float b = a;
	}
}
