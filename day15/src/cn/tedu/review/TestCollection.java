package cn.tedu.review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/*本类用于复习Collection*/
public class TestCollection {
    public static void main(String[] args) {
        //1.创建集合对象
        Collection<Integer> c = new ArrayList();
        Collection<Integer> c2 = new ArrayList();
        //2.1向c集合中添加元素
        c.add(100);
        c.add(200);
        c.add(300);
        c.add(400);
        c.add(500);
        System.out.println(c);
        //2.2向c2集合添加元素
        c2.add(2);
        c2.add(4);
        c2.add(6);
        c2.add(8);
        System.out.println(c2);

        //3.按照API手册练习方法
        c.addAll(c2);
        System.out.println(c);

//        c.clear();
//        System.out.println(c);

        System.out.println(c.contains(300));

        System.out.println(c.remove(4));
        System.out.println(c);

        System.out.println(c.containsAll(c2));

        Collection<Integer> c3 = new ArrayList();
        c3.add(100);
        c3.add(200);
        c3.add(300);
        c3.add(400);
        c3.add(500);
        c3.add(2);
        c3.add(6);
        c3.add(8);
        System.out.println(c);
        System.out.println(c.equals(c3));
        System.out.println(c.equals(100));
        System.out.println(c.equals(c2));

        System.out.println(c.isEmpty());

        System.out.println(c);
        System.out.println(c.removeAll(c2));
        System.out.println(c);

        System.out.println(c.retainAll(c2));
        System.out.println(c);
        System.out.println(c.size());

        Object[] array = c2.toArray();
        System.out.println(Arrays.toString(array));

        //4.集合的迭代
        /*迭代:
        * 1.获取集合的迭代器 c2.iterator()
        * 2.利用迭代器进行判断当前集合中是否有下一个可迭代的元素
        *   it.hasNext()
        * 3.获取当前迭代到的元素 it.next()*/
        Iterator<Integer> it = c2.iterator();//获取迭代器
        while (it.hasNext()) {//循环,判断是否有元素可迭代
            Integer num = it.next();//根据迭代器获取本轮迭代到的元素
            System.out.println(num);
        }
    }
}
