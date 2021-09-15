package cn.tedu.api;

/*本类用于测试基本类型的包装类*/
public class TestNumber {
    public static void main(String[] args) {
        //创建int包装类Integer对象的方式1
        Integer integer1 = new Integer(100);
        Integer integer11 = new Integer(100);
        System.out.println(integer1 == integer11);

        //创建int包装类Integer对象的方式2
        /*Integer有一个高效的效果,但是必须满足3个条件
        * 1.是Integer类型
        * 2.使用valueOf()的创建方式
        * 3.数据在-128~127的范围内
        * 满足以上条件,相同的数据只会存一次,后续再使用都是以前存过的数据*/
        Integer i2 = Integer.valueOf(100);
        Integer i22 = Integer.valueOf(100);
        System.out.println(i2 == i22);

        Integer i3 = Integer.valueOf(300);
        Integer i33 = Integer.valueOf(300);
        System.out.println(i3==i33);

        //3.创建double包装类Double对象的方式1
        Double d1 = new Double(3.14);
        Double d11 = new Double(3.14);

        //4.创建double包装类Double对象的方式2
        /*只有Integer才有高效的效果Double是没有的*/
        Double d2 = Double.valueOf(3.14);
        Double d22 = Double.valueOf(3.14);
        System.out.println(d1==d11);
        System.out.println(d2==d22);

        //5.测试常用方法
        //这个方法的作用就是把传入的String类型的数据转成int
        /*对象是什么类型的,就可以使用这个类的所有资源i1是Interger类型的对象,
        * 所以可以使用parseDouble()将String类型的数据转为double类型
        * */
        System.out.println(integer1.parseInt("800")+8);
        System.out.println(d1.parseDouble("2.2")+3.1);

        System.out.println(String.valueOf(50)+8);
    }
}
