package cn.tedu.review;

public class TestFor {
    public static void main(String[] args) {
        /**1.for(定义循环变量;循环条件;更改条件){
         *      符合循环条件后,执行的循环体.
         }*/
        for (int i=10;i>=0;i--){
            System.out.print(i+" ");
        }
        for(int i=1; i<=100;i++) {
            System.out.println("good good study, day day up");
        }
        for (int i=8; i<=8888;i=i*10+8) {
            System.out.print((i+","));
        }
    }
}
