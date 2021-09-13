package cn.tedu.review;
/*本类用于复习继承*/
public class TestExtends {
    public static void main(String[] args) {
        Fruit f = new Fruit();
        Banana b = new Banana();
        SZJ s = new SZJ();
        f.clean();
        b.clean();
        s.clean();
        System.out.println(b.a);
        System.out.println(f.a);
        System.out.println(s.a);
    }
}

class Fruit {
    int a = 10;
    {
        System.out.println(a);
    }
    public void clean() {
        System.out.println("水果要先洗一洗");
    }
}

class Banana extends Fruit{

}

class SZJ extends Banana{

}