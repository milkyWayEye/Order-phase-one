package cn.tedu.oop;

public class TestPhone2 {
    public static void main(String[] args) {
        Phone2 p = new Phone2();
        Phone2 p2 = new Phone2();

        p2.brand = "sdkf";
        p2.price = 9879689.76567876;
        System.out.println(p2.price);
        p.play();
    }
}

class Phone2 {
    String brand;
    double price;

    public void play() {
        System.out.println("正在玩手机~");
    }
}
