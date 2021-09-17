package cn.tedu.generic;

import java.util.ArrayList;
import java.util.Arrays;

/*本类用于泛型的入门*/
public class TestGeneric1 {
    public static void main(String[] args) {
        /*1.泛型是怎么来的? 想要模拟数组的数据类型检查*/
        String[] s = new String[5];

        /*2.如果集合不加泛型,集合中的元素类型根本没有约束,太自由!!!*/
        ArrayList list = new ArrayList();
        list.add("霞霞");
        list.add(666);
        list.add(3.14);
        list.add('a');
        System.out.println(list);

        /*3.在集合中引入泛型的概念,泛型通常与集合一起使用
        * 这样就可以利用泛型约束集合中元素的类型,除此之外:
        * 可以把报错时机提前:只要元素的类型不匹配,在编译器就报错
        * 而不是运行代码时才报错,向集合中添加元素时,也会自动执行类型检查*/

        /*4.<type>--这个type的值应该怎么写
        * 需要根据集合中存入的元素类型做决定,但是type必须是引用类型,不能是基本类型
        * 所以,8大基本类型的泛型,应该使用其对应的包装类型*/
        ArrayList<Integer> list2 = new ArrayList();
        list2.add(200);
        System.out.println(list2);
    }
}
