package cn.tedu;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/*本类用于测试Collection接口中的常用方法*/
public class collectionTestCollection {
    public static void main(String[] args) {
        //1.创建Collection相关的对象
        Collection<Integer> c = new ArrayList<Integer>();

        //2.向集合中添加元素
        c.add(100);
        c.add(200);
        c.add(300);
        c.add(400);
        c.add(500);
        System.out.println(c);

        //3.测试集合中的常用方法
        System.out.println(c.hashCode());//获取集合对象对应的哈希码值
        System.out.println(c.toString());//[100,200,300,400,500]
        System.out.println(c.equals(200));//false,不能拿着集合对象
                                          // 与集合中的某一个元素做比较
        System.out.println(c.contains(200));//true,判断集合中是否有元素200
        System.out.println(c.isEmpty());//false,判断集合是否为空
        System.out.println(c.remove(400));//移除集合中的指定元素
        System.out.println(c);//[100,200,300,500]
        System.out.println(c.size());//4
        Object[] objects = c.toArray();//将集合转为数组
        System.out.println(Arrays.toString(objects));

        //4.测试集合间的操作
        Collection<Integer> c2 = new ArrayList<>();
        c2.add(2);
        c2.add(3);
        c2.add(4);
        System.out.println(c2);
        c.addAll(c2);//将c2集合的所有元素添加到c集合中
        System.out.println(c);
        System.out.println(c2);//c2集合不受影响

        System.out.println(c.containsAll(c2));//true,判断集合2中的所有元素是否
                                              // 被c集合所包含
        System.out.println(c.remove(2));
        System.out.println(c);
        System.out.println(c.containsAll(c2));//false,集合2中的元素2被删了

        System.out.println(c.removeAll(c2));//删除c集合中属于c2集合的所有元素
        System.out.println(c);

        c.add(4);
        System.out.println(c);
        System.out.println(c.retainAll(c2));//保留交集
        System.out.println(c);
    }
}
