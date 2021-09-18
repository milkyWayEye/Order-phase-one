package cn.tedu.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*本类用与List的练习*/
public class TestList {
    public static void main(String[] args) {
        //1.创建List接口的多态对象
        List<String> list = new ArrayList();

        //2.练习继承自Collection父接口中的方法
        list.add("大力娃");
        list.add("千顺娃");
        list.add("头铁娃");
        list.add("喷火娃");
        list.add("喷水娃");
        list.add("隐身娃");
        list.add("小紫娃");
        System.out.println(list);

//        list.clear();
//        System.out.println(list);

        System.out.println(list.contains("喷火娃"));
//        int a = 22;
//        new ArrayList<>().equals(a);
        System.out.println(list.equals(2));

        System.out.println(list.isEmpty());

        System.out.println(list.remove("小蝴蝶"));

        System.out.println(list.size());

        System.out.println(Arrays.toString(list.toArray()));

        //3.测试List接口自己的方法
        list.add("小蝴蝶");
        System.out.println(list);
        list.add(1,"蛇精");//在集合的指定索引出添加指定元素
        list.add(3,"小蝴蝶");
        System.out.println(list);

        System.out.println(list.indexOf("小蝴蝶"));
        System.out.println(list.lastIndexOf("小蝴蝶"));

        System.out.println(list.remove(2));//根据索引删除集合中的元素,并将被删除的元素返回
        System.out.println(list);

        System.out.println(list.get(8));
        System.out.println(list.set(5,"蝎子精"));//修改集合中指定索引处的值
        System.out.println(list);

        //4.集合间的操作
        List<String> list2 = new ArrayList<>();
        list2.add("1");
        list2.add("2");
        list2.add("3");
        list2.add("4");
        System.out.println(list2);

        System.out.println(list.addAll(list2));
        System.out.println(list);

        System.out.println(list.addAll(1,list2));
        System.out.println(list);
    }
}
