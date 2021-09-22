package cn.tedu.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*本类用于练习map案例:统计字符串中字符的个数
* 需求效果:用户输入aabbbc,输出:a=2,b=3,c=1*/
public class TestMap {
    public static void main(String[] args) {
        System.out.println("快给我输入:");
        String input = new Scanner(System.in).nextLine();
        Map<Character,Integer> map = new HashMap<>();
//        for (char n:
//             input.toCharArray()) {
//            if (!map.containsKey(n)) {
//                map.put(n,1);
//            }else {
//                map.put(n,map.get(n)+1);
//            }
//        }
        for (char n:
             input.toCharArray()) {
            Integer value = map.get(n);
            if (value==null){
                map.put(n,1);
            }else {
                map.put(n,value+1);
            }
        }
        System.out.println(map);
    }
}
