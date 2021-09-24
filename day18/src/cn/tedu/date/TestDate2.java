package cn.tedu.date;

import java.util.Date;

/*本类用于练习Date的常用方法*/
public class TestDate2 {
    public static void main(String[] args) {
        //1.创建Date对象
        Date d1 = new Date();
        System.out.println(d1);
        System.out.println(d1.getTime());//获取从标准基准时间到现在的毫秒值
        System.out.println(d1.getTime()*1.0/1000/60/60/24/365);

        long t = 1000*60*60;
        d1.setTime(t);
        System.out.println(d1);
    }
}
