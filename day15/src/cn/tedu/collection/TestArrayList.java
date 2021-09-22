package cn.tedu.collection;

import java.util.ArrayList;

/*本类用于测试ArrayList实现类*/
public class TestArrayList {
    public static void main(String[] args) {
        /*我们集合中存入的类型是引用类型,不是基本类型
        * 所以如果想根据元素删除数据,需要把int类型参数300
        * 转为集合中元素的类型Integer*/
        ArrayList<Integer> list = new ArrayList();
        list.add(300);
        list.add(400);
        System.out.println(list.remove(Integer.valueOf(300)));
        System.out.println(list);
        System.out.println(list.set(0,77));//修改指定位置的值
        System.out.println(list);
        Object s=new Object();
    }
}
