package cn.tedu.array;

import java.util.Arrays;

/**本类用于练习数组的创建*/
public class TestArray {
    public static void main(String[] args) {
        //创建数组
        //1.1静态创建
        char[] c1 = {'h','e','l','l','o'};
        char[] c2 = new char[] {'h','e','l','l','o'};

        //1.2动态创建--知道了数组的长度,后面再具体赋值
        char[] c3 = new char[5];//再内存中开辟一块连续的内存空间,用来存放5个字符

        String[] s1 = {"a","b","c"};
        String[] s2 = new String[] {"a","b","c"};
        String[] s3 = new String[5];

        /**char类型的数组底层中做了处理,可以直接打印数组中的具体元素
         * 除了char类型以外的数组想要查看数组中的具体元素,需要使用数组的工具类Arrays
         * 具体方式:Arrays.toString(数组名);
         * 注意Arrays使用时需要导包*/
        System.out.println(c1);
        System.out.println(Arrays.toString(s1));

        //5.查看数组的长度--数组中存放的元素的个数
        /**数组一旦创建,长度不可改变,如果想要增加或者是删除数组中的元素,只能先创建一个新长度的数组
         * ,再将原来的数据复制过去*/
        System.out.println(c1.length);
        System.out.println(s1.length);
    }
}
