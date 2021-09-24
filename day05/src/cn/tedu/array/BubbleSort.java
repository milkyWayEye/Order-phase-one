package cn.tedu.array;

import java.util.Arrays;

/**
 * 本类用于实现冒泡排序
 */
public class BubbleSort {
    public static void main(String[] args) {
        //创建一个无序的数组
        int[] a = {17, 96, 73, 25, 21};

        //2.调用冒泡排序的方法进行排序
        //method(a);

        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }

    //本方法用来实现冒泡排序
    private static void method(int[] a) {
        for (int i = 1; i < a.length; i++) {
            boolean flag = true;
            for (int j = 0; j < a.length - i; j++) {
                if (a[j] > a[j + 1]) {
                    a[j] = a[j] + a[j + 1];
                    a[j + 1] = a[j] - a[j + 1];
                    a[j] = a[j] - a[j + 1];
                    flag = false;
                }
            }
            if (flag) {//如果经历了内层循环的所有比较,没有进行一次交换,那么肯定已经排好序了
                break;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
