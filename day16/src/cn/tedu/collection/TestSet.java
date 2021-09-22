package cn.tedu.collection;

import java.util.HashSet;
import java.util.Set;
/*本类用来测试Set*/
public class TestSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("紫霞仙子");
        set.add("至尊宝");
        set.add("蜘蛛精");
        set.add("紫霞仙子");
        set.add(null);
        set.add(null);
        set.add("null");
        /*1.set集合中的元素都没有顺序的
        * 2.set集合中的元素都不能重复
        * 3.set集合可以存null值,但是最多只能存一个*/
        System.out.println(set);
        new HashSet<>().add(null);

        //常用方法
        System.out.println(set.contains("唐僧"));
        System.out.println(set.isEmpty());
        System.out.println(set.remove(null));
        System.out.println(set);

        //创建set2集合,并向集合中存入数据
        Set<String> set2 = new HashSet<>();
        set2.add("小兔纸");
        set2.add("小脑斧");
        set2.add("小海疼");
        set2.add("小牛犊");
        System.out.println(set2);

        System.out.println(set.addAll(set2));
        System.out.println(set);
        System.out.println(set.containsAll(set2));
        System.out.println(set);
        System.out.println(set.removeAll(set2));
        System.out.println(set);
        System.out.println(set.retainAll(set2));//求交集
        System.out.println(set);
    }
}
