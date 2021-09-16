package cn.tedu.io;

import java.io.*;
import java.util.Scanner;

/*本类用于完成文件复制案例*/
//综合案例的思路:
//1.拿到源文件的路径
//2.拿到目标位置的路径
//3.调用方法完成文件的复制
public class TestCopyFile {
    public static void main(String[] args) {
        //1. 提示并接收用户输入的两个路径
        System.out.println("请您输入原文件的路径:");
        String f = new Scanner(System.in).nextLine();
        System.out.println("请您输入目标位置的路径(含文件名):");
        String t = new Scanner(System.in).nextLine();
        //2.根据这两个路径调用自定义方法,完成文件的复制
        //ZFCopy(f,t);//用字符流完成文件复制的功能
        ZJCopy(f,t);//用字节流完成文件复制的功能
    }

    private static void ZJCopy(String f, String t) {
        /*字节流不仅可以处理文本相关的文件,还可以处理其他类型的文件*/
        InputStream in = null;
        OutputStream out = null;
        try {
            in = new BufferedInputStream(new FileInputStream(f));
            out = new BufferedOutputStream(new FileOutputStream(t,true));
            int a;
            while ((a=in.read())!=-1) {
                out.write(a);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void ZFCopy(String f, String t) {
        /*字符流用于与字符相关的操作,并不能实现比如文件的复制*/
        Reader in = null;
        Writer out = null;
        try {
            in = new BufferedReader(new FileReader(f));//从原文件读取数据
            out = new BufferedWriter(new FileWriter(t,true));//
            int b;
            new BufferedReader(new FileReader("")).read();
            while ((b = in.read())!=-1) {
                out.write(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                /*关流是有顺序的:如果有多个流需要关闭,最后创建的流是最先关闭的
                * 多条关流语句需要各自try-catch*/
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
