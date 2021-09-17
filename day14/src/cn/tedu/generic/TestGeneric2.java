package cn.tedu.generic;

public class TestGeneric2 {
    public static void main(String[] args) {
        //需求:打印下列数组中的所有元素
        Integer[] a = {1,2,3,4,5,6,7,8,9,10};

        String[] b = {"大娃","二娃","三娃","四娃","五娃","六娃","七娃"};

        Double[] c = {6.6,6.66,6.666,6.6666};
        print(a);
        print(b);
        print(c);
    }

    /*1.泛型可以实现更加通用高级的代码,使用E表示元素的类型是Element类型
    * 可以把这个理解成神似多态,不管传入什么类型,都可以匹配的上*/
    /*2.泛型方法的语法要求:如果在方法上使用泛型,必须两处同时出现:
    * 一个是方法的参数列表中的参数类型,一个是返回值前的泛型类型<E>
    * 表示这是一个泛型方法
    * */
    private static <E> void print(E[] e){
        for (E n:e) {
            System.out.println(n);
            System.out.println("泛型");
        }
    }
//
//    private static void print(Integer[] a){
////        for (int i = 0; i < a.length; i++) {
////            System.out.println(a[i]);
////        }
//        /*高效for循环/foreach循环
//        * 语法:for(1 2 : 3){循环体}
//        * 3: 要遍历的数据 1:本轮遍历到的数据的类型 2:遍历到的数据的名字
//        * 好处:比普通的for循环写法简单,效率比较高
//        * 坏处:没有办法按照下标操作值,只能从头到尾的遍历数据*/
//        for (Integer n:
//             a) {
//            System.out.println(n);
//        }
//    }
//
//    private static void print(String[] a){
//        for (String n:a) {
//            System.out.println(n);
//        }
//    }
//    private static void print(Double[] a){
//        for (Double n:a) {
//            System.out.println(n);
//        }
//    }

}
