package cn.tedu.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/*本类用于练习字符输出流*/
public class TestOut2 {
    public static void main(String[] args) {
        method1();//本类用于测试普通字符输出流
        method2();//本类用于测试高效字符输出流
    }

    //使用高效的字符输出流BW进行输出
    private static void method2() {
        Writer out = null;
        try {
            out = new BufferedWriter(new FileWriter("E:\\ready\\7.txt",true));
            out.write(78);
        } catch (IOException e) {
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
        Writer out = null;
        try {
            out = new FileWriter("E:\\ready\\7.txt",true);
            out.write(98);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
