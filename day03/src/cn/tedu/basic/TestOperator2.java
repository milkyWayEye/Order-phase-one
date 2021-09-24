package cn.tedu.basic;
/**本类用于测试自增自减运算符*/
public class TestOperator2 {
	public static void main(String[] args) {
		/**符:--,相当于是给变量本身的值减1
		 * 前缀式:符号写在前,比如++a,--a,先改变变量本身的值,再使用
		 * 后缀式:符自增运算符:++,相当于是给变量本身的值加1
		 * 自减运算号写在后,比如a++,a--,先使用变量,再改变变量本身的值
		 * */
		int a = 1;
		System.out.println(a);//1
		System.out.println(++a);//2
		System.out.println(a++);//2
		System.out.println(a);//3
		
		int c = 1;
		c--;
		System.out.println(--c-c-c--);//1
	}
}
