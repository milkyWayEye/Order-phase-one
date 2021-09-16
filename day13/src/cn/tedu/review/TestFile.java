package cn.tedu.review;

import java.io.File;
import java.io.IOException;

/*本类用于复写File类的API*/
public class TestFile {
    public static void main(String[] args) {
        //1.创建File类的对象,注意File类需要导包
        File file = new File("E:\\ready\\1.txt");

        //2.测试文件的常用方法
        System.out.println(file.length());//获取文件的字节量
        System.out.println(file.exists());//判断文件是否存在
        System.out.println(file.isFile());//判断当前file对象代表的路径是否是文件
        System.out.println(file.isDirectory());//判断当前file对象代表的路径是否为文件夹
        System.out.println(file.getName());//获取文件名
        System.out.println(file.getParent());//获取父级路径,不包含文件名
        System.out.println(file.getAbsolutePath());//获取带盘符,带文件名的路径:绝对路径

        //3.测试file对象对应在外部windows中的创建
        file = new File("E:\\ready\\5.txt");
        try {
            System.out.println(file.createNewFile());//创建一个之前不存在的文件,注意有异常抛出
        } catch (IOException e) {
            e.printStackTrace();
        }

        file = new File("E:\\ready\\aaa");
        System.out.println(file.mkdir());//创建一个之前不存在的单层文件夹

        file = new File(("E:\\ready\\j\\q\\k"));
        System.out.println(file.mkdirs());//创建一个之前不存在的多层文件夹

        System.out.println(file.delete());//true,只能删除空文件夹与文件
        System.out.println(file.delete());//false

        file = new File("E:\\reayd\\5.txt");
        System.out.println(file.delete());

        //4.文件列表测试
        file = new File("E:\\ready");
        String[] list = file.list();//返回值类型是一个String[],数组里都是String类型的对象
        File[] fs = file.listFiles();//返回类型是一个File[],数组里都是File类型的对象
        //如果想要能够拿到File对象调用listFiles()
    }
}
