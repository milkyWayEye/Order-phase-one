package cn.tedu.api;
/*本类用于String类的入门案例*/
public class TEstString {
    public static void main(String[] args) {
        /*1.一个类的对象通过什么方式创建,取决于这个类定义了哪些构造方法
        * 2.如果刚接触一个类,不太清楚如何创建这个类的对象可以查看API手册中这个对象的构造函数*/
        /*3.查API手册得知:String有一个构造方法 String(char[] values)*/
        //1.创建String的方式一
        char[] values = {'a','b','c'};
        String s1 = new String(values);
        String s2 = new String(values);
        /*4.String底层重写了Object的toString(),所以可以直接打印字符串的内容*/
        System.out.println(s1.toString());
        System.out.println(s2);

        //2.创建方式二
        /*这种创建方式有一个高效的效果,因为数据存在堆中的常量池中
        * 如果是第一次创建,会在堆中常量池创建此字符串对象
        * 再次创建相同内容时,就不会再新建了,避免重复创建,浪费效率*/
        String s3 = "abc";
        String s4 = "abc";
        System.out.println(s3);
        System.out.println(s4);

        System.out.println(s1==s2);//false
        System.out.println(s1==s3);//false
        System.out.println(s3==s4);//true
        /*String还重写了equals(),比较的是两个字符串的内容*/
        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals(s3));//true
        System.out.println(s3.equals(s4));//true

    }
}
