package cn.tedu.array;

import java.util.Arrays;

/**本类用于练习数组的缩容与扩容*/
public class TestArraysCopyOf {
    public static void main(String[] args) {
        //1.创建数组
        int[] from = {1,2,3,4,5};

        //2.数组的普通复制
        /**copyOf()用于完成数组的复制,两个参数:
         * 参数1:要复制哪个数组
         * 参数2:新数组的长度*/
        int[] to = Arrays.copyOf(from,5);
        System.out.println(Arrays.toString(to));
        //2.2数组的扩容
        /**扩容:给数组扩大容量,新数组的长度>原数组的长度*/
        /**扩容思路:先创建对应长度的新数组,每个位置上都是默认值0
         * 然后从原数组中将元素复制到新数组,没有被覆盖的元素还是默认值0*/
        int[] to2 = Arrays.copyOf(to,10);
        System.out.println(Arrays.toString(to2));

        //2.3数组的缩容
        /**缩容:缩小数组的容量,新数组的长度<原数组的长度*/
        /**缩容思路:先创建对应长度的新数组,每个位置上都是默认值0
         * 然后从原数组中复制指定个数的元素到新数组中,类似于截取*/
        int[] to3 = Arrays.copyOf(to,3);
        System.out.println(Arrays.toString(to3));

        //2.4指定首尾截取原数组中的元素
        /**Arrays.CopyOfRange用于完成数组截取,参数
         * 参数1:要截取哪个数组
         * 参数2:从原数组的哪个下标开始
         * 参数3:到原数组的哪个下标结束
         * 注意:截取的元素包含开始下标处的元素,不包含结束下标处的元素*/
        int[] to4 = Arrays.copyOfRange(from,2,10);
        System.out.println(Arrays.toString(to4));
    }
}
