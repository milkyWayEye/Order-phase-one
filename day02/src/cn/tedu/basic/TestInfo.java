package cn.tedu.basic;
/**本类用于完成个人信息输出案例*/
public class TestInfo {
	public static void main(String[] args) {
		/**
		 * 1.定义变量的规则：变量的类型 变量的名字 变量的值
		 * 2.创建变量
		 */
		int age = 18;//表示变量年龄，值为18
		double salary = 100000.99;//表示变量薪水，值为100000.99
		/**一串字符，在Java中用String类型也就是字符串类型保存
		 * 注意：String类型的数据需要使用""包裹起来*/
		String name = "泡泡";
		//3.可以通过打印语句查看变量的值
		System.out.println(age);
		/**3.我们可以使用+把静态数据与动态数据拼接起来*/
		System.out.println("我是"+name);
		System.out.println(String.format("Java架构师%s今年%d岁,月薪%f,感慨Java是世界上最"
				+ "好的语言",name,age,salary));
	}
}
