package cn.tedu.fordemo;
/**
 * 本类用于练习嵌套for循环
 */

/**
 * 总结:
 * 1.外层循环执行
 * 2.打印图形的时候,外部循环控制行数,内部循环控制列数
 */
public class TestFor3 {
    public static void main(String[] args) {
//        for (int i = 1; i < 4; i++) {
//            System.out.println(i);
//            for (int j = 1; j < 6; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//
//        System.out.println("打印矩形");
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
