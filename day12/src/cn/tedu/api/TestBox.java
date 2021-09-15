package cn.tedu.api;
/*本类用来测试自动装箱与自动拆箱*/
public class TestBox {
    public static void main(String[] args) {
        //1.定义包装类型Integer类型的对象
        Integer i1 = new Integer(5);
        Integer i2 = Integer.valueOf(5);

        //2.现在的方式
        /*1.自动装箱:编译器会自动把基本类型int 5,包装成对应类型Interger
        * 然后交给i3来保存,自动装箱底层发生的代码:Integer.valueOf(5);
        * valueOf()的方向:int ---> Integer*/
        Integer i3 = 5;//不会报错,这个现象就是自动装箱

        /*2.自动拆箱:编译器会自动把包装类型的i1拆掉"箱子",变回基本类型数据5
        * 然后交给基本类型int类型的变量i4来保存,底层发生的代码:i1.intValue()
        * intValue()的方向:Integer ---> int*/
        int i4 = i1;//不会报错,这个现象就是自动拆箱
    }
}
