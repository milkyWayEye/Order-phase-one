package cn.tedu.basic;

/** 本类用于练习选择结构switch */
/**
 * 总结: 1.变量a的类型支持byte short char int String 2.执行顺序:会拿着变量a的值,依次与每个case后的值作比较
 * 如果匹配到,就会执行这个case后的语句 而且注意,如果case后面没有加break,会执行后面所有的代码,
 * 包括default,我们称之为"穿透"
 * 3.如果设置了default保底选项,没有任何case被匹配到,就会执行default后的语句
 * 4.break与default是可选项,可加可不加,根据自己的业务决定即可
 */
public class TestSwitch {
	public static void main(String[] args) {
		int a = 3;
		switch (a) {
		case 1:
			System.out.println("1");
		case 2:
			System.out.println("2");
		case 3:
			System.out.println("3");
		case 4:
			System.out.println("4");
		case 5:
			System.out.println("5");
		default:
			System.out.println();
		}
	}
}
