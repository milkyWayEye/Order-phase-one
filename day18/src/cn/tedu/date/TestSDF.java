package cn.tedu.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*本类用于练习日期转换工具类SimpleDateFormat*/
public class TestSDF {
    public static void main (String[] args) throws ParseException {
        /*方向:Date->String*/
        //1.创建日期对象
        Date d1 = new Date();
        //2.创建日期转换工具类的对象
        //4.创建日期转换工具类的对象2
        SimpleDateFormat sdf = new SimpleDateFormat();
        //3.利用日期转换类,将日期转换为字符串
        String s = sdf.format(d1);
        System.out.println(s);
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
        String s2 = sdf2.format(d1);
        System.out.println(s2);

        /*方向:String->Date*/
        //1.定义一个时间字符串
        String s3 = "2021/09/24 05:30:05";
        //2.创建日期转换工具类对象,注意!!!一定要指定转换的规则,否则报错
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
        //3.利用日期转换工具类对对象进行日期转换
        Date d3 = sdf3.parse(s3);
        System.out.println(d3);
    }
}
