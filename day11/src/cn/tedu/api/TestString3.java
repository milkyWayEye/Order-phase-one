package cn.tedu.api;

public class TestString3 {
    public static void main(String[] args) {
        //需求:将26个字母拼接10000次
        String s = "abcdefghijklmnopqrstuvwxyz";
        //method1(s);
        method2(s);
    }

    //法2
    private static void method2(String s) {
        //1.创建工具类对象
        StringBuffer sb = new StringBuffer();
        StringBuilder sb2 = new StringBuilder();

        long t1 = System.currentTimeMillis();
        //2.让循环执行10000次进行拼接
        for (int i = 0; i < 1000; i++) {
            //在每一轮循环中,使用工具类进行拼接
            /*我们常用的拼接方法就是StringBuilder/StringBuffer中的append()*/
            sb2.append(s);
        }
        long t2 = System.currentTimeMillis();
        System.out.println(t2-t1);
        System.out.println(sb2);
    }

    //法1
    private static void method1(String s) {
        String result = "";
        //计时功能
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            result += s;
        }
        long t2 = System.currentTimeMillis();
        System.out.println(t2 - t1);
        System.out.println(result);
    }
}
