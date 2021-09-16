package cn.tedu.io;

import java.io.*;

/*本类用于测试字节输出流*/
public class TestOut {
    public static void main(String[] args) {
        //method1();//用于测试普通字节输出流
        method2();//用于测试高效字节输出流
    }

    private static void method2() {
        OutputStream out = null;
        try{
            out = new BufferedOutputStream(new FileOutputStream("E:\\ready\\2.txt",true));
            out.write(99);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void method1() {
        OutputStream out = null;
        try {
            out = new FileOutputStream("E:\\ready\\2.txt");

            //4.使用输出流
            /*FOS有一个重载的构造函数,第二个参数是boolean append
            * 默认为false,如果不写,表示创建的流对象是覆盖输出数据的
            * 如果我们手动将append的值设为true,表示创建的流对象是追加输出数据的
            * FileOutputStream(File file)--默认覆盖
            * FileOutputStream(File file, boolean append)--append为true表示追加输出数据*/
            out.write(97);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
//                assert out != null;
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
