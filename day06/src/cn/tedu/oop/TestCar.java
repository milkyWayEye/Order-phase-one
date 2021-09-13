package cn.tedu.oop;

/**
 * 本类用作面向对象综合案例
 */
public class TestCar {
    public static void main(String[] args) {
        Car c = new Car();
        Car c2 = new Car();
        Car c3 = new Car();
        c.setBrand("TSL");
        System.out.println(c.getBrand());
        c2.setPrice(10.1);
        System.out.println(c2.getPrice());
        c3.setColor("尊贵紫");
        System.out.println(c3.getColor());
        System.out.println(c2.getColor());
        /*被private修饰的资源只能在本类中使用*/
    }
}

class Car {
    private String brand;
    private String color;
    private double length;
    private double price;

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

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void start() {
        System.out.println("我的小车车启动啦~");
    }
    public void stop() {
        System.out.println("我的小车车停下来啦~");
    }
}
