package cn.tedu.basic;

/**
 * 本类用于测试各种类型变量的默认值
 */
/**1.整型类型数据的默认值是0
 * 2.浮点型类型数据的默认值是0.0
 * 3.布尔类型数据的默认值是false
 * 4.字符型类型数据的默认值是\u0000,在eclipse中是一个空格
 * 5.引用类型[除8大基本类型以外的类型]默认值是null
 * */
public class TestVariable1 {
    static String name;
    static byte a;
    static short b;
    static int c;
    static long d;
    static float e;
    static double f;
    static char g;
    static boolean h;

    public static void main(String[] args) {
        /**由于main()方法是被static静态修饰的
         * 所以main()想要使用的这些变量也得是静态的*/
        System.out.println(name);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
    }
}
