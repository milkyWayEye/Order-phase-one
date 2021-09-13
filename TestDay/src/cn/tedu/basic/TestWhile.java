package cn.tedu.basic;

public class TestWhile {
    public static void main(String[] args) {
        int i = 0;
        while(i<10){
            System.out.println("小可爱们中午好~");
            i++;
        }
        int j = 1;
        while (j<11) {
            System.out.println(j);
            j++;
        }
        int m = 1;
        while (m<100) {
            System.out.println(m);
            m+=2;
        }
        int sum = 0;
        int n = 1;
        while (n<11) {
            sum+=n;
            n++;
        }
        System.out.println(sum);
    }
}
