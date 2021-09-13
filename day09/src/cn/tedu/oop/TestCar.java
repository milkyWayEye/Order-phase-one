package cn.tedu.oop;

/*本类用于汽车设计综合案例*/
public class TestCar {
    public static void main(String[] args) {
        BMW b = new BMW();
        System.out.println(b.color);
        System.out.println(b.getColor());

        Car c2 = new TSL();
        System.out.println(c2.getColor());

    }
}

class Car {
    private String brand;//品牌
    private String color;
    private int id;
    private double length;

    public void start() {
        System.out.println("我的车车启动啦~");
    }

    public void stop() {
        System.out.println("哎呀妈,熄火了~");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}

class BMW extends Car {
    String color = "黑";
    @Override
    public void start() {
        System.out.println("都让开,我的车要起飞了~");
    }
}

class TSL extends Car {
    @Override
    public void stop() {
        System.out.println("哎呀妈,咋停不下来呢");
    }

    public void swim() {
        System.out.println("没想到吧,我还是个潜水艇");
    }
}