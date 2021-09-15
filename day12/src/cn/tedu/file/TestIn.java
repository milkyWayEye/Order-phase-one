package cn.tedu.file;

import java.io.*;

/*本类用于练习字节输入流*/
public class TestIn {
    public static void main(String[] args) {
        method1();
    }

    private static void method1() {
        try {
            //InputStream in = new FileInputStream(new File("E:\\ready\\1.txt"));
            InputStream in = new FileInputStream("E:\\ready\\1.txt");

            //开始读取
            System.out.println(in.read());
            System.out.println(in.read());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
