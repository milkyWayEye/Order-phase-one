package cn.tedu.array;

import java.util.Arrays;
import java.util.Random;

/**
 * 本类用于进一步练习数组
 */
public class ArrayExec {
    public static void main(String[] args) {
        //m1();//用于从数组中取数据
        //m2();//用于想数组中存数据
        //m3();//创建一个随机数组
        int[][] m = new int[3][];
        m[0] = new int[] {2};
        System.out.println(Arrays.toString(m[0]));
    }

    private static void m3() {
        //1.动态创建一个长度为10的数组
        int[] a = new int[new Random().nextInt(10)];
        /**数组的长度可以为0*/

        //2.遍历数组,依次向数组中的每个位置存入随机值
        for (int i=0;i<a.length;i++) {
            a[i] = new Random().nextInt(100);
        }
        System.out.println(Arrays.toString(a));
    }

    private static void m2() {
        //1.动态创建一个长度为10的数组
        int[] a = new int[10];

        //2.遍历数组,依次给数组的每一个位置上的元素赋值
        for (int i=0;i<a.length;i++) {
            a[i] = i+1;
        }

        //3.循环结束以后,说明数组的每个位置都经历了赋值[存数据]
        System.out.println(Arrays.toString(a));
    }

    private static void m1() {
        //1.创建一个数组,用来存放12个月的天数
        int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        /**数组的遍历:从头到尾把数组每个位置轮一遍*/
        //2.通过for循环遍历数组
        for (int i = 0; i < month.length; i++) {
            System.out.println(String.format("%d月有%d天", i + 1, month[i]));
        }
    }
}
