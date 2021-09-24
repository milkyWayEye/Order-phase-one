package cn.tedu.fordemo;

/**
 * 本类用于进一步练习for循环
 */
public class TestFor2 {
    public static void main(String[] args) {
        /**需求1:求出1-100以内所有数的和*/
        int sum = 0;
        for (int i = 1; i < 101; i++) {
            sum += i;
        }
        System.out.println(sum);
        /**需求1:求出1-100以内所有偶数的和*/
        int sum2 = 0;
        for (int i = 1; i < 101; i++) {
            if (i % 2 == 0) {
                sum2 += i;
            }
        }
        System.out.println(sum2);
        /**需求3:求1-100以内所有奇数的个数*/
        int number = 0;
        for (int i = 1; i < 101; i++) {
            if (i % 2 != 0) {
                number++;
            }
        }
        System.out.println(number);
    }
}
