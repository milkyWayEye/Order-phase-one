package cn.tedu.io;

import java.io.*;

/*本类用于测试字节输入流*/
public class TestIn {
    public static void main(String[] args) {
        //method1();//使用普通的字节输入流读取文件
        method2();//使用高效的字节输入流读取文件
    }

    private static void method2() {
        //1.创建流对象
        InputStream in = null;
        try {
            in = new BufferedInputStream(new FileInputStream("E:\\ready\\1.txt"));
            //使用流对象
            int b;
            while ((b=in.read())!=-1) {
                System.out.println(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void method1() {
        //1.创建流对象 -- 字节输入流InputStream -- 抽象父类不可实例化
        //FileInputStream -- 插在文件上对文件做操作的字节输入流
        //注意:创建的时候会抛出异常,要try-catch
        //定义一个在本方法中都生效的局部变量,局部变量必须手动初始化
        InputStream in = null;//引用类型的默认值都是null
        try {
            in = new FileInputStream("E:\\ready\\1.txt");

            //2.使用流对象
            /*ready()方法一次只能读取一个字节,并且这个方法的返回值类型是int
            * 也就是说会到码表中查看字符对应的编码,比如读到字符a,控制台打印97
            * 如果文件里没有数据了,也就是读到了文件的末尾,这个方法返回-1*/
            //System.out.println(in.read());
            //System.out.println(in.read());
            //System.out.println(in.read());
            //System.out.println(in.read());
            //System.out.println(in.read());
            //System.out.println(in.read());
            //2.2优化一下刚刚读取的代码
            //需求:需要使用循环结构读取文件中的所有内容,直至读完
            //定义变量,用来保存读到的数据
            int b;
            //只要读到的数据不是-1,就说明还有数据
            while ((b=in.read())!=-1) {
                System.out.println(b);
            }
        } catch (IOException e) {
            e.printStackTrace();//如果捕获到异常,打印错误信息到控制台
        } finally {
            /*finally{}是try-catch结构中的最后一个部分
            * 这个部分的代码不论是否发生了异常,一定会执行
            * 我们常在finally{}中添加一些必须执行的操作,比如关流*/
            try {
                in.close();//关流操作也有可能抛出异常,所以需要就绪try-catch
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //2.使用流对象
        //3.关闭流对象
    }
}
