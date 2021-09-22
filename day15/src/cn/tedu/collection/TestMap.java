package cn.tedu.collection;

import java.util.*;

/*本类用于测试Map接口*/
public class TestMap {
    public static void main(String[] args) {
        //1.创建Map对象
        Map<Integer,String> map = new HashMap();
        //2.向集合中存入数据
        map.put(9527,"白骨精");
        map.put(9528,"黑熊精");
        map.put(9529,"鲤鱼精");
        map.put(9530,"黄毛怪");
        System.out.println(map);
        /*1.map中存放的都是无序的数据
        * 2.map种的value可以重复
        * 3.map中的key不能重复,如果重复value会被覆盖*/

        //3.测试Map种的常用方法
        //map.clear()//清空map
        System.out.println(map.hashCode());//获取集合对象的哈希码值
        System.out.println(map.equals("黄毛怪"));//集合对象于集合中的某个元素不等
        System.out.println(map.isEmpty());//判断集合是否为空
        System.out.println(map.size());//获取集合中的元素个数
        System.out.println(map.containsKey(9527));//true,判断集合是否包含指定的KEY
        System.out.println(map.containsValue("黑熊精"));//true,判断集合是否包含指定的VALUE
        System.out.println(map.get(9527));//根据KEY值获取集合中对应的VALUE值
        System.out.println(map.remove(9527));
        System.out.println(map.containsValue("鲤鱼精"));
        System.out.println(map.containsKey(9529));//false
        /*删除的是键值对*/

        /*将map集合中的所有VALUE取出,存入到一个Collecation集合中*/
        Collection<String> values = map.values();
        System.out.println(values);

        //4.集合的迭代法1
        /*方式一:
        * 想要迭代map中的数据,但是map本身没有迭代器,所以需要先转换成Set集合
        * Set<KEY>:把map中的所有的KEY值存入到Set集合中,用到的方法keySet()*/
        //4.1将map集合汇总的key值取出,存入set集合中,集合的泛型就是key的类型
        Set<Integer> keySet = map.keySet();
        System.out.println(keySet);
        //4.2获取这个set集合的迭代器
        Iterator<Integer> it = keySet.iterator();
        //4.3判断是否有一个元素可以迭代
        while (it.hasNext()) {
            //4.4如果有元素可以迭代,打印本轮循环获取到的元素
            int a;
            System.out.println(a=it.next());
            System.out.println(map.get(a));
        }

        //5.map集合的迭代法2
        /*想要迭代map集合,需要把map集合转换成cet集合
        * 这次是把map中的每一对键值对都看作是一个
        * Entry<K,V>
        * 一对Key&Value就是一个Entry<K,V>
        * */
        //5.1将map集合的每一对键值对作为一个Entry存入set集合
        Set<Map.Entry<Integer,String>> set = map.entrySet();
        //5.2获取集合的迭代器
        Iterator<Map.Entry<Integer,String>> it2 = set.iterator();
        //5.3判断集合中是否有下一个元素可迭代
        while (it2.hasNext()) {
            //5.4打印本轮循环遍历到的
            Map.Entry<Integer, String> entry = it2.next();
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("{"+key+","+value+"}");
        }
    }
}
