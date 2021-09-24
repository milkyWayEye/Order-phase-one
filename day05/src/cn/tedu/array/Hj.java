package cn.tedu.array;

import java.util.Arrays;

public class Hj {
    public static void main(String[] args) {
        int[] a = {17, 96, 73, 25, 21};
        for (int i=1;i<a.length;i++) {
            boolean flag = true;
            for (int j=0;j<a.length-i;j++) {
                if (a[j]>a[j+1]) {
                    a[j] += a[j+1];
                    a[j+1] = a[j] - a[j+1];
                    a[j] -= a[j+1];
                    flag = false;
                }
            }
            if (flag) break;
        }
        System.out.println(Arrays.toString(a));
    }
}
