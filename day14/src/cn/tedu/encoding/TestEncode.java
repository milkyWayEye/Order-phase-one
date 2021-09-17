package cn.tedu.encoding;

import java.io.*;

/*本类用于测试编码转换流*/
public class TestEncode {
    public static void main(String[] args) {
        method1();//用来测试OutputStreamWriter
        method2();//用来测试InputStreamReader
    }

    private static void method2() {
        InputStreamReader in = null;
        try {
            in = new InputStreamReader(new FileInputStream(
                    "E:\\ready\\1.txt"),"utf-8");
            //read()方法的返回值类型是int,打印的是编码
//            System.out.println(in.read());
//            System.out.println(in.read());
            char[] ch = new char[8192];
            //这个是Reader中的方法:read(char[] cbuf)将字符读入数组,返回
            //读取到的字符的个数
            int len = in.read(ch);
            //此处是String的构造函数,利用ch数组中的数据,构建一个字符串,并打印
            //到控制台
            System.out.println(new String(ch,0,len));
            System.out.println(ch);
            System.out.println(in.read());
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void method1() {
        //1.创建一个在本方法中都生效的局部变量,并给 变量初始化
        OutputStreamWriter out = null;
        //2.由于代码可能会产生IO异常,所以需要完成try-catch-finally结构
        try {
            //3.创建流对象
            out = new OutputStreamWriter(new FileOutputStream(
                    "E:\\ready\\1.txt"),"utf-8");
            //4.使用流对象写出数据
            out.write("海绵宝宝与派大星");
            System.out.println("执行成功");
        }catch (Exception e) {
            System.out.println("执行失败");
            e.printStackTrace();
        }finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
