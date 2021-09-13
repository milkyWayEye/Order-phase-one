package cn.tedu.review;

public class TestConstructor {
    public static void main(String[] args) {
        Phone p1 = new Phone("vivo",1,4699);
        Phone p2 = new Phone();
    }
}

class Phone {
    String brand;
    int id;
    double price;

    public Phone() {

    }

    public Phone(String brand, int id, double price) {
        this.brand = brand;
        this.id = id;
        this.price = price;
    }
}
