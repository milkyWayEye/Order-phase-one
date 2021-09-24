package cn.tedu.basic;

import java.util.concurrent.SynchronousQueue;

/**基本类型*/
public class TestTypeScope {
	public static void main(String[] args) {
		//2.Java
		byte byteMin = Byte.MIN_VALUE ;
		byte byteMax = Byte.MAX_VALUE;
		System.out.println("byte的类型的最小值:"+byteMin);
		System.out.println("byte类型的最大值为:"+byteMax);
		
		short shortMin = Short.MIN_VALUE;
		short shortMax = Short.MAX_VALUE;
		System.out.println("short类型的最小值为:"+shortMin);
		System.out.println("short类型的最大值为:"+shortMax);
		
		int intMin = Integer.MIN_VALUE;
		int intMax = Integer.MAX_VALUE;
		System.out.println("int类型的最小值为:"+intMin);
		System.out.println("int类型的最大值为:"+intMax);
		
		long longMin = Long.MIN_VALUE;
		long longMax = Long.MAX_VALUE;
		System.out.println("long类型的最小值:"+longMin);
		System.out.println("long类型的最大值:"+longMax);
		
		/**4.浮点类型: float double*/
		float floatMin = Float.MIN_VALUE;
		float floatMax = Float.MAX_VALUE;
		System.out.println("float类型的最小值:"+floatMin);
		System.out.println("float类型的最大值:"+floatMax);
		
		double doubleMin = Double.MIN_VALUE;
		double doubleMax = Double.MAX_VALUE;
		System.out.println("double类型的最小值:"+doubleMin);
		System.out.println("double类型的最大值:"+doubleMax);
		
		/**5.boolean布尔类型只有两个值true和false
		 * 虽然true和false不是关键字,但是也不可以用作标识符*/
//		boolean b1 = true;
//		boolean b2 = false;d
		
		/**
		 * 6.测试char字符类型
		 * 字符型的数据需要使用单引号''来包裹
		 * char类型可以存数字,但是会从ASCII码表查出这个数字对应的字符来打印
		 * 128~65535这些数字,也可以保存,但是eclipse一般显示为?
		 * */
		char c1 = 'a';
		char c2 = '中';
		char c3 = '7';
		char cMin = Character.MIN_VALUE;
		char cMax = Character.MAX_VALUE;
		System.out.println(cMin);
		System.out.println(cMax);
		System.out.println(Boolean.TRUE);
	}
}
