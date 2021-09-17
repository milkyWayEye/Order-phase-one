package cn.tedu.serializable;

import java.io.*;

/*本类用于测试对象的序列化与反序列化*/
/*序列化:
* 是指把程序中的java对象,通过序列化流OOS输出到磁盘的文件中,相当于数据写出的过程
* 反序列化
* 是指把之前已经保存在文件中的对象的相关数据,通过反序列化流OIS读到内存中的过程
* 相当于数据读取的过程*/
public class TestSerializable {
    public static void main(String[] args) {
        //method1();//本方法用于测试序列化
        method2();//本方法用于测试反序列化
    }

    private static void method2() {
        //定义一个在本方法中都生效的局部变量,注意初始化
        ObjectInputStream in = null;
        //由于IO操作可能会产生异常,,所以完成try-catch-finally结构
        try {
            in = new ObjectInputStream(new FileInputStream("E:\\" +
                    "ready\\1.txt"));
            Student student = new Student();
            Object o = in.readObject();
            student = (Student) o;
            System.out.println(student.getAge());
            System.out.println(o.toString());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /*如果本类想要被序列化,那么必须实现一个可序列化的接口Serializable,否则会报错
    * Serializable接口是一个空接口,里面什么方法都没有
    * 实现这个接口相当于给Student类做了一个标记,标记这个类的对象可以被序列化,语法规定*/
    private static void method1() {
        //1.创建流对象
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream(
                    "E:\\ready\\1.txt"));
            //2.使用流对象
            Student s = new Student("海绵宝宝",3,"海里",
                    '男');
            out.writeObject(s);
            System.out.println("序列化成功");
            /*成功后,我们可以在目标文件里看到序列化输出的数据
            * 但注意:这个数据是为了底层保存对象和传输使用到,我们看不懂
            * 有些类似与我们的字节码文件中的数据*/
        } catch (IOException e) {
            System.out.println("序列化失败");
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
