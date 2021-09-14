package cn.tedu.api;

import com.sun.media.jfxmediaimpl.HostUtils;

import java.util.Arrays;

/*本类用来测试String类的常用方法*/
public class TestString2 {
    public static void main(String[] args) {
        String s1 = "abc";

        char[] c = new char[]{'a','b','c'};
        String s2 = new String(c);

        //2.测试常用方法
        /*String重写了hashCode(),是根据字符串的内容生成哈希码值的
        * 所以虽然s1与s2一个在堆的常量池中,一个在堆中,它们的哈希码一样*/
        System.out.println(s1.hashCode());//96354
        System.out.println(s2.hashCode());//96354

        System.out.println(s1.toString());//不需要调用,因为调用返回的是他自己..
        System.out.println(s1);

        System.out.println(s1.length());//查看当前字符串长度
        System.out.println(s1.toUpperCase());//ABC,将本字符串转为全大写
        System.out.println(s1.toLowerCase());//全小
        System.out.println(s1.startsWith("ab"));//true,判断本字符串是否以指定元素开头
        System.out.println(s2.endsWith("ab"));//false,...结尾

        System.out.println(s1.charAt(0));//根据下标获取本字符串中对应的元素

        String s3 = "abcddbba";
        System.out.println(s3.indexOf("b"));//返回本字符串中指定元素在字符串中第一次出现时的下标
        System.out.println(s3.lastIndexOf("b"));//返回...最后一次....

        System.out.println(s2.concat("cxy"));//将制定字符串拼接到本字符串的结尾
        System.out.println(s2);//说明上面的拼接时临时的,不会改变原串的内容

        String s5 = "afbfcfdfffe";
        //返回值类型时String[],所以需要使用Arrays.toString()打印
        //以指定字符作为分隔符,分割当前的字符串
        System.out.println(Arrays.toString(s5.split("f")));//[a, b, c, d, , , e]

        String[] a = s5.split("f");
        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);
        }

        String s6 = "      hh hhh      ";//去除本字符串首尾两端的空格
        System.out.println(s6.trim());//hh hhh

        String s7 = "abcdefgh";
        System.out.println(s7.substring(3));//从指定下标处截取字符串[3,结束]
        System.out.println(s7.substring(3,6));//从指定下标处截取子字符串,含头不含尾

        System.out.println(String.valueOf(10));//将int类型的参数转为String类型
        System.out.println(String.valueOf(80)+10);

        byte[] bytes = s7.getBytes();//将指定字符串转为byte[]
    }
}
