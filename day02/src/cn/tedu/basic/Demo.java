package cn.tedu.basic;
/**本类用于练习字面值规则*/
public class Demo {
	public static void main(String[] args) {
		/**1.整数的默认类型是int类型*/
//		int i = 9999999999999;
		/**2.小数的默认类型是double类型*/
		double d = 3.14;
//		float f = 3.14;
		float f = 3.14F;
		/**3.byte short char 3种比int小的类型,可以使用范围内的值直接报错*/
		/**4.字面值后缀:L-long类型*/
//		long i2 = 99999999999999;
		long i3 = 9999999999999999L;
		int a = 130;
		byte b = (byte)a;
		System.out.println(b);
	}
}
