package cn.tedu.bigdecimal;

import java.math.BigDecimal;
import java.util.Scanner;

/*本类用于解决浮点数运算不精确的问题*/
//需求:接收用户输入的两个小数,做四则运算
public class TestBigDecimal {
    public static void main(String[] args) {
        //f1();//使用普通的+-*/做运算
        f2();//使用BigDecimal做运算
    }

    private static void f2() {
        try {
            //1.提示并接收用户输入的两个小数
            System.out.println("请输入第一个小数:");
            double a = new Scanner(System.in).nextDouble();
            System.out.println("请输入第二个小数:");
            double b = new Scanner(System.in).nextDouble();
            /*1.最好不要使用double作为构造函数的参数类型,因为Double本身就存在不精确的现象
            * 2.最好私用另外一个String类型参数的构造方法,就可以精确计算了
            * double转String的快速方法:拼个空串就行了*/
            BigDecimal bigDecimal = new BigDecimal(""+a);
            BigDecimal bigDecimal1 = new BigDecimal(String.valueOf(b));
            //定义一个BigDecimal类的对象来保存运算的结果
            BigDecimal bd3;
            //2.用接收到的两个数做四则运算
            bd3 = bigDecimal.add(bigDecimal1);//加法
            System.out.println(bd3);
            System.out.println(bigDecimal.subtract(bigDecimal1));//减法
            System.out.println(bigDecimal.multiply(bigDecimal1));//乘法
            /*divide()做除法运算时,除不尽会抛出算术异常
            * 所以推荐使用divide(0,m,n)
            * o:指的是你要除以谁,这里时bd2
            * m:指的是如果除不尽,结果保留几位小数
            * n:指的是保留时采取的舍入方式,这里采用的时四舍五入ROUND_HALF_UP
            * */
            bd3 = bigDecimal.divide(bigDecimal1,3,BigDecimal.ROUND_HALF_UP);
            System.out.println(bd3);
        }catch (Exception e) {
            System.out.println("输入类型错误");
        }
    }

    private static void f1() {
        try {
            //1.提示并接收用户输入的两个小数
            System.out.println("请输入第一个小数:");
            double a = new Scanner(System.in).nextDouble();
            System.out.println("请输入第二个小数:");
            double b = new Scanner(System.in).nextDouble();
            //2.用接收到的两个数做四则运算
            System.out.println(a+b);
            System.out.println(a-b);
            System.out.println(a*b);
            System.out.println(a/b);
        }catch (Exception e) {
            System.out.println("输入类型错误");
        }
    }
}