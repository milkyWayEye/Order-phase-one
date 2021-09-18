package cn.tedu;

public class Test {
    public static void main(String[] args) {
        System.out.println(2);
        ss.main();
        ob(23);
        Object ss = 5;
    }
    public <E> void ss(E i) {

    }
    public static void ob(Object oo) {
        System.out.println(oo);
    }
}
class ss{
    public static void main() {
        System.out.println(1);
    }
}
interface s{
    public static void s(){};
    public static void method(){};
}
class tt implements s{
    public static void method() {

    }
}