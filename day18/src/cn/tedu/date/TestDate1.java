package cn.tedu.date;

import java.util.Date;

public class TestDate1 {
    public static void main(String[] args) {
        //1.利用无参构造创建日期对象,注意导包:import java.util.Date;
        Date d1 = new Date();
        System.out.println(d1);

        //2.利用含参构造创建日期对象
        long t = 1000*60*60;
        //从标准基础时间[1970--1--1 00:00]开始往后数tms
        Date d2 = new Date(t);
        System.out.println(d2);
        //本来变成了1点,但是我们中国的标准时间需要加8h,所以变成了9点
    }
}
