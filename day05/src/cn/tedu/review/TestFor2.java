package cn.tedu.review;
/**本类用于练习嵌套for循环*/
public class TestFor2 {
    public static void main(String[] args) {
        f1();//调用打印矩形的方法
        f2();//调用打印做直角三角形的方法
        f3();//调用打印99乘法表的方法
    }

    private static void f3() {
        for (int i=1;i<10;i++) {
            for (int j=1;j<i+1;j++) {
                System.out.print(j+"*"+i+"="+i*j+"\t");
            }
            System.out.println();
        }
    }

    private static void f2() {
        for (int i=0;i<7;i++) {
            for (int j=0;j<i+1;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void f1() {

    }
}
