package cn.tedu.review;

import java.util.Arrays;
import java.util.Random;

/**本类用于方法的复习*/
public class TestMethod {

    public static void main(String[] args) {
        int[] a = creatArray();
        System.out.println(a);
        System.out.println(Arrays.toString(a));
        int[] b = sortArray(a);
        System.out.println(b);
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(a));
        int[] c = a;
        c[0] = 0;
        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.toString(a));
    }

    private static int[] sortArray(int[] a) {
        System.out.println(a);
        for (int i=1;i<a.length;i++) {
            boolean fag = true;
            for (int j=0;j<a.length-i;j++) {
                if (a[j]>a[j+1]) {
                    a[j] = a[j] + a[j+1];
                    a[j+1] = a[j] - a[j+1];
                    a[j] = a[j] - a[j+1];
                    fag = false;
                }
            }
            if (fag) break;
        }
        return a;
    }

    private static int[] creatArray() {
        int[] a = new int[new Random().nextInt(100)];
        for (int i=0;i<a.length;i++) {
            a[i] = new Random().nextInt(100);
        }
        System.out.println(a);
        System.out.println(Arrays.toString(a));
        return a;
    }
}
