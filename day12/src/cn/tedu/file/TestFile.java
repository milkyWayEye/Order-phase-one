package cn.tedu.file;

import java.io.File;
import java.util.Arrays;

/*本类用于测试文件类File*/
public class TestFile {
    public static void main(String[] args) {
        //1.创建File类对象
        /*1.ready目录与1.txt需要自己手动创建
        * 2.file需要导包:import java.io.File
        * 3.路径是String类型,必须写正确,不然找不到文件
        * 4.完整的文件名包含两部分:文件名+后缀名*/
        File file = new File("E:\\ready\\1.txt");
        System.out.println(file.length());

        //2.测试File中的常用方法
        System.out.println(file.length());//获取文件的字节量
        System.out.println(file.exists());//true,判断文件是否存在
        System.out.println(file.isFile());//true,判断是否未为文件
        System.out.println(file.isDirectory());//falses,判断是否为文件夹
        System.out.println(file.getName());//获取文件名
        System.out.println(file.getParent());//获取父级路径
        System.out.println(file.getAbsolutePath());//获取带盘符的完整路径:绝对路径

        //2.2 测试创建与删除
        /*new 只会帮你在内存中创建一个File类型的对象
        * 并不会帮你在磁盘中创建一个真实存在的文件*/
        try {
            //创建一个该路径的文件
            /*如果指定创建文件的路径不对,会抛出异常:java.io.Exception
            * 所以需要提前处理
            * 这个IO异常是目前我们遇到的强制要求必须预先处理的异常
            * 如果不处理,方法的调用会报错,通不过编译*/
            System.out.println(file.createNewFile());//创建之前不存在的文件
            file = new File("E:\\ready\\m");
            System.out.println(file.mkdir());//创建之前不存在的单层文件夹

            file = new File("E:\\ready\\a\\b\\c");
            System.out.println(file.mkdirs());//创建之前不存在的多层文件夹

            System.out.println(file.delete());//c被删除,删除空文件夹或者文件

            file = new File("E:\\ready\\a");
            System.out.println(file.delete());//false,a文件夹不能被删除,里面有内容

            file = new File("E:\\ready\\1.txt");
            System.out.println(file.delete());

            //2.3测试展示文件列表
            file = new File("E:\\ready");
            String[] list = file.list();
            System.out.println(Arrays.toString(list));
            //这句话会报错,因为这是一个String[],所以数组中每个元素都是String类型的
            //那么只能用String的方法,不能用File中的方法
            //System.out.println(list[0].isDirectory());

            File[] files = file.listFiles();
            System.out.println(Arrays.toString(files));
        } catch (Exception e) {
            System.out.println("出错了");
        }
    }
}
