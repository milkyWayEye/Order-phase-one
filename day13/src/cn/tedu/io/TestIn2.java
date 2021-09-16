package cn.tedu.io;

import java.io.*;

/*本类用于练习字符输入流*/
public class TestIn2 {
    public static void main(String[] args) {
        //method1();//用于测试普通字符输入流
        method2();//用于测试高效字符输入流
    }

    private static void method2() {
        //1.创建高效字符输入流对象
        Reader in = null;
        try {
            in = new BufferedReader(new FileReader("E:\\ready\\1.txt"));

            //2.通过流对象完成读取操作
            int a;
            while ((a=in.read())!=-1) {
                System.out.println(a);
            }
        } catch (IOException e) {
            e.printStackTrace();
            //3.关闭输入流
            try {
                in.close();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
    }

    private static void method1() {
        //1.创建流对象
        FileReader in1=null;
        try {
            in1 = new FileReader("E:\\ready\\1.txt");
            //2.使用流对象
            int b;
            while ((b=in1.read())!=-1){
                System.out.println(b);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //3.关闭流对象
            try {
                in1.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //2.使用流对象
        //3.关闭流对象
    }
}
