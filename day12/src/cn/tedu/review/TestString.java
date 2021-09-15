package cn.tedu.review;

import java.util.Arrays;

public class TestString {
    public static void main(String[] args) {
        String s1 = "abc";
        System.out.println(s1);

        System.out.println(s1.charAt(1));

        String s3 = "aggjsefgd";
        System.out.println(s3.indexOf("g"));
        System.out.println(s3.lastIndexOf("g"));

        System.out.println(s1.concat("bbb"));//abcbbb
        System.out.println(s1);//abc

        String s4 = "   aaa   a  ";
        System.out.println(s4.trim());//aaa   a

        System.out.println(s3.substring(4));//sefgd
        System.out.println(s3.substring(4,6));//se

        byte[] bytes = s1.getBytes();//将字符串转为字节数组
        System.out.println(Arrays.toString(bytes));

        System.out.println(String.valueOf(77)+10);//将int数据转为String

        String s5 = "a b c d e";
        String[] s = s5.split(" ");
        System.out.println(Arrays.toString(s));
    }
}
