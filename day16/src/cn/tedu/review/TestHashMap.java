package cn.tedu.review;

import java.util.*;

public class TestHashMap {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(9527,"白骨精");
        map.put(9528,"黑熊精");
        map.put(9529,"小旋风");
        map.put(9530,"女儿国国王");
        System.out.println(map);

        //常用方法测试
        //map.clear;//清空集合
        System.out.println(map.isEmpty());//判断集合是否为空
        System.out.println(map.size());//获取map中键值对的个数
        System.out.println(map.hashCode());//获取map对象的哈希码值
        System.out.println(map.containsKey(9527));//判断是否包含指定的KEY
        System.out.println(map.containsValue("白骨精"));//判断是否包含指定的Value
        System.out.println(map.get(9530));//根据key值获取对应的value
        System.out.println(map.remove(9530));//根据key移除一对键值对
        System.out.println(map);
        Collection<String> values = map.values();//把所有value值组成一个集合

        //map集合的迭代
        //法一 keySet()
        Set<Integer> integers = map.keySet();//把所有key值组成一个set集合
        Iterator<Integer> it = integers.iterator();
        while (it.hasNext()) {
            Integer key = it.next();
            System.out.printf("%d,%s\t",key,map.get(key));
        }
        System.out.println();

        //法二 EntrySet()
        //将map集合转为一个Set集合,这个集合里存的是将每一对KV都看作十一哥Entry
        //Map.Entry<Integer,String>--Entry是map中的一种键值对结构
        Set<Map.Entry<Integer,String >> set2 = map.entrySet();
        Iterator<Map.Entry<Integer,String>> it2 = set2.iterator();
        while (it2.hasNext()) {
            Map.Entry<Integer,String> entry = it2.next();
            Integer key = entry.getKey();
            System.out.printf("%d,%s\t",key,map.get(key));
        }
        System.out.println();

    }
}
