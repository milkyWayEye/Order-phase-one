package cn.tedu.basic;
/*本类用来测试类型转换
* 1.bytel--short char2--int4--long8--float4--double8
* 2.小到大,直接转:隐式转换,可以直接转换
*   大到小,强制转:显式转换,需要强转,注意发生数据溢出的问题
*   浮变整,小数没:小数部分直接被舍弃
* 3.强制类型转换的格式:目标类型 变量名 = (目标类型)要转换类型的数据;*/
public class TestTypeChange {
    public static void main(String[] args) {
        byte a = 2;
        byte b = 3;
        byte c = (byte)(a+b);
        System.out.println();

        short e1 = 'a'+'b';
        char f1 = 120;
        System.out.println(e1);
        System.out.println(f1);

        char m = 'a';
        char n = 'b';
        short e2 = (short)(m+n);
        char e3 = 'a' + 'b';

        int l = 9;
        char dd = 9;
        char dd1 = (char)l;
    }
}
