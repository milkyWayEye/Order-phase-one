package cn.tedu.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TestList2 {
    public static void main(String[] args) {
        //1.创建多态对象
        List<String> list = new ArrayList<>();
        //2.向接口中添加元素
        list.add("喜羊羊");
        list.add("美羊羊");
        list.add("懒羊羊");
        list.add("沸羊羊");
        list.add("小肥羊");
        list.add("肥牛卷");
        System.out.println(list);

        /*集合的迭代方式:
        * 1.for循环
        * 2.foreach 高效for循环
        * 3.iterator*/
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        for (String n:list) {
            System.out.println(n);
        }
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        /*方式四迭代:listIterator属于List接口特有的迭代器
        * Itreator<E> 父接口 hasNext() next
        * ListIterator<E> 子接口--除了从父接口处继承的功能以外
        * 还有自己的特有功能,比如逆序便历 添加元素等等,但是不常用
        * public interface ListIterator<E> extends Iterator<E>
        * */

        //1.获取迭代器对象
        ListIterator<String> it2 = list.listIterator();
        //2.
        while (it2.hasNext()){
            System.out.println(it2.next());
        }
        System.out.println("**********方式五逆序迭代**********");
        ListIterator<String> it3 = list.listIterator();
        while (it3.hasNext()) {
            System.out.println(it3.next());
            if(!it3.hasNext()) {
                System.out.println("开始逆序遍历");
                while (it3.hasPrevious()){//判断前面是否有元素可以迭代
                    System.out.println(it3.previous());
                }
                break;
            }
        }
    }
}
