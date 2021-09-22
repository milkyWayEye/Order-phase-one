package cn.tedu.collection;

import java.util.LinkedList;

/*本类用于测试LinkedList方法的使用*/
public class TestLinkedList {
    public static void main(String[] args) {
        //1.创建集合对象
        LinkedList<String> list = new LinkedList<>();
        //2.向集合中添加数据
        list.add("孙悟空");
        System.out.println(list);
        //测试LinkedList独有的方法
        list.addFirst("蜘蛛精");//添加集合头节点数据
        list.addLast("玉兔精");//添加集合尾节点数据
        System.out.println(list);

        System.out.println(list.getFirst());//获取头结点数据
        System.out.println(list.getLast());//获取尾节点数据

        System.out.println(list.removeFirst());//删除手元素
        System.out.println(list.removeLast());//删除尾元素
        System.out.println(list);

        LinkedList<String> list2 = new LinkedList<>();
        list2.add("西游记");
        System.out.println(list2);
        System.out.println(list2.element());//获取集合中的首元素
        /*别名:查询系列*/
        System.out.println(list2.peek());//获取集合中的首元素
        System.out.println(list2.peekFirst());//..首元素
        System.out.println(list2.peekLast());//..尾元素

        /*别名:新增系列*/
        System.out.println(list2.offer("斗罗大陆"));//添加尾元素
        System.out.println(list2.offerFirst("盗墓笔记"));//..手元素
        System.out.println(list2.offerLast("钢铁是怎样炼成的"));
        System.out.println(list2);

        /*别名:移除系列*/
        System.out.println(list2.poll());//移除首元素
        System.out.println(list2.pollFirst());//移除首元素
        System.out.println(list2.pollLast());//移除尾元素
        System.out.println(list2);
    }
}
